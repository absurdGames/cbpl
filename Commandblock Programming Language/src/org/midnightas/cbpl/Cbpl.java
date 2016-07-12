package org.midnightas.cbpl;

import static org.midnightas.cbpl.CompiledString.IMPULSE;
import static org.midnightas.cbpl.Token.TOKEN_KEY;
import static org.midnightas.cbpl.Token.TOKEN_STRING;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import org.fusesource.jansi.Ansi.Color;

public class Cbpl {

	public static final void main(String[] args) {
		AnsiConsole.systemInstall();
		try {
			if (args.length == 0)
				throw new FileNotFoundException("Please specify a file.");
			Scanner s = new Scanner(new File(args[0]));
			s.useDelimiter("\\Z");
			String content = s.next();
			s.close();
			new Cbpl("Main", content).interpret();
		} catch (CbplException e) {
			System.err.println("Error found on CBPL file: " + e.getMessage());
			System.err.println("Token location: " + e.tokenLocation);
		} catch (FileNotFoundException e) {
			System.err.println("Could not load file for compiling: " + (args.length == 0 ? "null" : args[0]));
			e.printStackTrace(System.err);
		}
		AnsiConsole.systemUninstall();
	}

	public ArrayList<Token> tokens = new ArrayList<Token>();

	public HashMap<String, Variable> scope = new HashMap<String, Variable>();

	public String content;

	private HashMap<String, Function> functions = new HashMap<String, Function>();

	public List<CompiledString> compiled = new ArrayList<>();

	public String globalVarsEntityName = "CBPLGlobalVars";
	
	public int tl_debug = 0;

	public Cbpl(String name, String s) {
		this.content = s;
		functions.put("print", new Function() {
			@Override
			public Object call(Object[] args) {
				if(!isNumber(args[1]))
					args[1] = "\"" + args[1] + "\"";
				compiled.add(new CompiledString(IMPULSE, "/tellraw " + args[0] + " [" + args[1] + "]"));
				return null;
			}
		});
		read();
		scope.put("true", new Variable(0, "true", true));
		scope.put("false", new Variable(1, "false", true));
	}

	public void read() {
		content += " ";
		int state = TOKEN_KEY;
		String token = "";
		for (int cl = 0; cl < content.length(); cl++) {
			char c = content.charAt(cl);
			token += c;
			if (token.endsWith(" ") && state == TOKEN_KEY) {
				tokens.add(new Token(TOKEN_KEY, token.substring(0, token.length() - 1)));
				token = "";
			} else if (token.endsWith("\\") && state == TOKEN_STRING) {
				token = token.substring(0, token.length() - 1) + content.charAt(cl + 1);
				cl++;
			} else if (token.endsWith("\"")) {
				if (state == TOKEN_KEY) {
					state = TOKEN_STRING;
					token = "";
				} else if (state == TOKEN_STRING) {
					tokens.add(new Token(TOKEN_STRING, token.substring(0, token.length() - 1)));
					state = TOKEN_KEY;
					token = "";
				}
			} else if (!isCountinuous(token) && state == TOKEN_KEY) {
				tokens.add(new Token(TOKEN_KEY, token.substring(0, token.length() - 1)));
				tokens.add(new Token(TOKEN_KEY, token.charAt(token.length() - 1) + ""));
				token = "";
			}
		}
		for (int tl = 0; tl < tokens.size(); tl++) {
			Token t = tokens.get(tl);
			if (t.type == Token.TOKEN_KEY && t.key.trim().isEmpty()) {
				tokens.remove(tl);
				tl--;
			}
		}
		System.out.println(tokens);
	}

	private static List<Character> continuousChars = new ArrayList<>();

	public static boolean isCountinuous(String token) {
		for (int cl = 0; cl < token.length(); cl++) {
			Character c = token.charAt(cl);
			if (!continuousChars.contains(c) && c != '@' && c != '=')
				return false;
		}
		return true;
	}

	public static boolean isValidIdentifierName(String token) {
		for (Character c : token.toCharArray())
			if (!continuousChars.contains(c))
				return false;
		return true;
	}

	public void interpret() throws CbplException {
		globalVarsEntityName = "CBPLGlobalVars";
		for (int tl = 0; tl < tokens.size(); tl++, tl_debug++) {
			Token t = tokens.get(tl);
			if (t.key.endsWith("=") && t.type == TOKEN_KEY) {
				String name = tokens.get(tl - 1).key;
				List<Token> toEval = new ArrayList<Token>();
				for (int tl0 = tl + 1; tl0 < tokens.size(); tl0++) {
					Token t0 = tokens.get(tl0);
					if (t0.key.equalsIgnoreCase(";") && t0.type == TOKEN_KEY) {
						tl = tl0;
						break;
					} else
						toEval.add(t0);
				}
				boolean isFinal = t.key.toLowerCase().startsWith("f");
				boolean alreadyExists = scope.containsKey(name);
				if (alreadyExists && scope.get(name).isFinal)
					throw new CbplException(tl, "Cannot modify final variable \"" + name + "\"");
				Variable v = alreadyExists ? scope.remove(name) : new Variable(null, name, isFinal);
				v.content = evaluate(toEval);
				if (!v.isFinal && !isNumber(v.content))
					throw new CbplException(tl, "Only forgetable variables can be text.");
				scope.put(name, v);
				if (!isFinal) {
					if (!alreadyExists)
						compiled.add(new CompiledString(IMPULSE,
								"/scoreboard objectives add " + variableToCompiledName(v) + " dummy"));
					compiled.add(new CompiledString(IMPULSE, "/scoreboard players set @e[type=ArmorStand,name="
							+ globalVarsEntityName + "] " + variableToCompiledName(v) + " " + v.content));
				}
			} else if (t.key.equalsIgnoreCase("(")) {
				String name = tokens.get(tl - 1).key;
				List<Object> args = new ArrayList<>();
				List<Token> tempArgs = new ArrayList<>();
				int deep = 0;
				for (int tl0 = tl + 1; tl0 < tokens.size(); tl0++) {
					Token t0 = tokens.get(tl0);
					if (t0.key.equalsIgnoreCase(",") && t0.type == TOKEN_KEY && deep == 0) {
						args.add(evaluate(tempArgs));
						tempArgs = new ArrayList<>();
					} else if (t0.key.equalsIgnoreCase("(") && t0.type == TOKEN_KEY)
						deep++;
					else if (t0.key.equalsIgnoreCase(")") && t0.type == TOKEN_KEY) {
						if (--deep == -1) {
							args.add(evaluate(tempArgs));
							tempArgs = new ArrayList<>();
							tl = tl0;
							break;
						} else
							deep--;
					} else
						tempArgs.add(t0);
				}
				if (functions.containsKey(name))
					functions.get(name).call(args.toArray());
				else
					throw new CbplException(tl, "Function \"" + name + "\" does not exist.");
			}
		}
		if (doNonfinalVariablesExist())
			compiled.add(0,
					new CompiledString(IMPULSE,
							"/summon ArmorStand 0 -5 0 {Invisible:1b,NoGravity:1b,Small:1b,CustomName:\""
									+ globalVarsEntityName + "\",CustomNameVisible:1b}"));
		for (CompiledString entry : compiled)
			System.out.println(entry.type + ": " + Ansi.ansi().fg(Color.WHITE).bold().a(entry.result).reset());
		System.out.println(scope);
	}

	public Object evaluate(List<Token> toEval) throws CbplException {
		for (int tl = 0; tl < toEval.size(); tl++) {
			Token t = toEval.get(tl);
			if (t.type == TOKEN_KEY) {
				if (t.key.equalsIgnoreCase("*")) {
					String t0 = toEval.remove(tl - 1).key;
					toEval.remove(tl - 1);
					String t1 = toEval.remove(tl - 1).key;
					tl--;
					if (isNumber(t0) && isNumber(t1)) {
						toEval.add(tl, new Token(TOKEN_KEY, (toNumber(t0) * toNumber(t1)) + ""));
					}
				} else if (t.key.equalsIgnoreCase("/")) {
					String t0 = toEval.remove(tl - 1).key;
					toEval.remove(tl - 1);
					String t1 = toEval.remove(tl - 1).key;
					tl--;
					if (isNumber(t0) && isNumber(t1)) {
						toEval.add(tl, new Token(TOKEN_KEY, (toNumber(t0) / toNumber(t1)) + ""));
					}
				} else if (t.key.equalsIgnoreCase("^")) {
					String t0 = toEval.remove(tl - 1).key;
					toEval.remove(tl - 1);
					String t1 = toEval.remove(tl - 1).key;
					tl--;
					if (isNumber(t0) && isNumber(t1)) {
						toEval.add(tl, new Token(TOKEN_KEY, (Math.pow(toNumber(t0), toNumber(t1))) + ""));
					}
				} else if (t.key.equalsIgnoreCase("(")) {
					Token name = tl == 0 ? null : toEval.get(tl - 1);
					boolean isFunctionCall = name != null && isCountinuous(name.key) && !isNumber(name.key);
					if (isFunctionCall) {
						List<Object> args = new ArrayList<>();
						List<Token> tempArgs = new ArrayList<>();
						int deep = 0;
						for (int tl0 = tl + 1; tl0 < toEval.size(); tl0++) {
							Token t0 = tokens.get(tl0);
							if (t0.key == "," && t0.type == TOKEN_KEY && deep == 0) {
								args.add(evaluate(tempArgs));
								tempArgs = new ArrayList<>();
							} else if (t0.key == "(" && t0.type == TOKEN_KEY)
								deep++;
							else if (t0.key == ")" && t0.type == TOKEN_KEY) {
								if (--deep == -1) {
									args.add(evaluate(tempArgs));
									tempArgs = new ArrayList<>();
									tl = tl0;
									break;
								} else
									deep--;
							}
						}
						if (functions.containsKey(name))
							functions.get(name.key).call(args.toArray());
						else
							throw new CbplException(tl, "Function \"" + name + "\" does not exist.");
					}
				} /*else if (isValidIdentifierName(t.key) && !isNumber(t.key)) {
					if (scope.containsKey(t.key)) {
						Variable v = scope.get(toEval.remove(tl).key);
						Token toAdd;
						if (v.isFinal)
							toAdd = new Token(TOKEN_KEY, v.content + "");
						else
							toAdd = new Token(TOKEN_KEY,
									"{\"score\":{\"name\":\"@e[type=ArmorStand,name=" + globalVarsEntityName
											+ "]\",\"objective\":\"" + variableToCompiledName(v) + "\"}}");
						toEval.add(tl, toAdd);
					} else
						throw new CbplException(tl, "Variable \"" + t.key + "\" does not exist.");
				}*/ else if (t.key.equalsIgnoreCase("==") && t.type == TOKEN_KEY) {
					toEval.remove(tl);
					String one = toEval.remove(tl - 1).key;
					String two = "";
					List<Token> toEval0 = new ArrayList<>();
					int deep = 0;
					for (int tl0 = tl - 1; tl0 < toEval.size(); tl0++) {
						Token t0 = toEval.get(tl0);
						if (t0.key.equalsIgnoreCase("(") && t0.type == TOKEN_KEY)
							deep++;
						else if (t0.key.equalsIgnoreCase(")") && t0.type == TOKEN_KEY) {
							if (--deep == -1)
								break;
						} else {
							toEval0.add(t0);
							toEval.remove(tl0);
						}
					}
					two = evaluate(toEval0).toString();
					toEval.add(--tl, new Token(TOKEN_KEY, "" + one.equals(two)));
				}
			}
		}
		for (int tl = 0; tl < toEval.size(); tl++) {
			Token t = toEval.get(tl);
			if (t.type == TOKEN_KEY) {
				if (t.key.equalsIgnoreCase("+")) {
					Token one_old = toEval.remove(tl - 1);
					Object one;
					if (isNumber(one_old.key) && one_old.type == TOKEN_KEY) {
						one = toNumber(one_old.key);
					} else if (one_old.type == TOKEN_KEY && scope.containsKey(one_old.key)) {
						if (scope.get(one_old.key).isFinal)
							one = isNumber(scope.get(one_old.key).content) ? toNumber(scope.get(one_old.key).content) : scope.get(one_old.key).content;
						else
							throw new CbplException(tl_debug + tl,
									"Operating on non-final variables will be featured in the next version.");
					} else if (one_old.type == TOKEN_STRING) {
						one = one_old.key;
					} else
						one = null;
					toEval.remove(tl - 1);
					Token two_old = toEval.remove(tl - 1);
					Object two;
					if (isNumber(two_old.key) && two_old.type == TOKEN_KEY) {
						two = toNumber(two_old.key);
					} else if (two_old.type == TOKEN_KEY && scope.containsKey(two_old.key)) {
						if (scope.get(two_old.key).isFinal)
							two = isNumber(scope.get(two_old.key).content) ? toNumber(scope.get(two_old.key).content) : scope.get(two_old.key).content;
						else
							throw new CbplException(tl_debug + tl,
									"Operating on non-final variables will be featured in the next version.");
					} else if (two_old.type == TOKEN_STRING) {
						two = two_old.key;
					} else
						two = null;
					tl--;
					if (one instanceof Integer && two instanceof Integer)
						toEval.add(tl, new Token(TOKEN_KEY, (toNumber(one) + (toNumber(two)) + "")));
					else
						toEval.add(tl, new Token(TOKEN_KEY, one + "" + two));
				} else if (t.key.equalsIgnoreCase("-")) {
					String t0 = toEval.remove(tl - 1).key;
					toEval.remove(tl - 1);
					String t1 = toEval.remove(tl - 1).key;
					tl--;
					if (isNumber(t0) && isNumber(t1)) {
						toEval.add(tl, new Token(TOKEN_KEY, (toNumber(t0) - toNumber(t1)) + ""));
					}
				}
			}
		}
		return toEval.get(0).key;
	}

	public boolean doNonfinalVariablesExist() {
		for (Variable v : scope.values())
			if (!v.isFinal)
				return true;
		return false;
	}

	public static int toNumber(Object str) {
		return Integer.parseInt(str.toString());
	}

	public static boolean isNumber(Object str) {
		try {
			Integer.parseInt(str.toString());
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static String variableToCompiledName(Variable v) {
		return "cbplvar" + v.id;
	}

	static {
		for (char c = 'a'; c <= 'z'; c++)
			continuousChars.add(c);
		for (char c = 'A'; c <= 'Z'; c++)
			continuousChars.add(c);
		for (char c = '0'; c <= '9'; c++)
			continuousChars.add(c);
	}

}
