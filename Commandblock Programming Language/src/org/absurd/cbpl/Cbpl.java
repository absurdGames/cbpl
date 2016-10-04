package org.absurd.cbpl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

import org.absurd.cbpl.parsing.CBPLLexer;
import org.absurd.cbpl.parsing.CBPLParser;
import org.absurd.cbpl.parsing.CBPLParser.ProgramContext;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.FileUtils;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

public class Cbpl {

	public static final int MAJOR_VERSION = 0;
	
	public static String TELLRAW_FORMAT = "/tellraw %s %s";
	public static String SETUP_ARMOR_STAND = "/summon ArmorStand ~ ~ ~ {CustomName:\"%s\",CustomNameVisible:0}";
	public static String NEW_VARIABLE = "/scoreboard objectives add %1$s dummy %1$s";

	public static Scanner in;

	public static final void main(String[] args) throws Exception {
		in = new Scanner(System.in);
		AnsiConsole.systemInstall();
		Cbpl cbpl = new Cbpl();
		cbpl.interpret(FileUtils.readFileToString(new File(args[0])));
		for (CompileResult compiled : cbpl.compiled)
			System.out.println(compiled);
		System.out.println(Ansi.ansi().cursorLeft(1).reset());
		AnsiConsole.systemUninstall();
		in.close();
	}

	public Visitors visitors;
	public Map<String, BiConsumer<Cbpl, Map<String, Variable>>> functions;
	public List<CompileResult> compiled;
	public Map<String, String> compileNames;
	public String scriptName = "";
	public String armorStandSelector = "";
	public Map<String, Variable> compileTimeVars;

	public Cbpl() {
		visitors = new Visitors(this);
		functions = new HashMap<String, BiConsumer<Cbpl, Map<String, Variable>>>();
		compileTimeVars = new HashMap<String, Variable>();
		compileNames = new HashMap<String, String>();
		compiled = new ArrayList<CompileResult>();
		/* Built-in Functions */
		functions.put("say", (cbpl, args) -> compiled.add(new CompileResult(CompileResult.CHAIN, String
				.format(TELLRAW_FORMAT, args.get("who").value, simpleVarToString(args.get("obj"))))));
	}

	public void interpret(String code) {
		compiled.clear();
		CBPLLexer lexer = new CBPLLexer(new ANTLRInputStream(code));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CBPLParser parser = new CBPLParser(tokens);
		parser.setBuildParseTree(true);
		ProgramContext tree = parser.program();
		tree.accept(visitors.mainVisitor);
		if (compiled.size() > 0)
			compiled.get(0).type = CompileResult.IMPULSE;
	}

	public void getScriptName() {
		System.out.println(Ansi.ansi().fgGreen()
				.a("This script uses non-compile-time variables. Please enter a script name to use as the ArmorStand name and the scoreboard name.\nSpaces are not allowed.")
				.reset());
		scriptName = in.nextLine();
		armorStandSelector = "@e[type=ArmorStand,name=" + scriptName + "]";
	}

	public String simpleVarToString(Variable v) {
		if (!v.isAlreadyJSON)
			return "{\"text\":\"" + v.value + "\"}";
		assert v.value instanceof String;
		return v.value + "";
	}

}
