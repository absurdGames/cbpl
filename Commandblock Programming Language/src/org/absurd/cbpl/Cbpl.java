package org.absurd.cbpl;

<<<<<<< HEAD
import static org.absurd.cbpl.CompileResult.CHAIN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import org.absurd.cbpl.parsing.CBPLLexer;
import org.absurd.cbpl.parsing.CBPLParser;
import org.absurd.cbpl.parsing.CBPLParser.ProgramContext;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.fusesource.jansi.AnsiConsole;
=======
import org.absurd.cbpl.token.Token;
import org.absurd.cbpl.codeblock.Line;
>>>>>>> refs/remotes/origin/master

public class Cbpl {

	public static final void main(String[] args) {
<<<<<<< HEAD
		AnsiConsole.systemInstall();
		new Cbpl().interpret("say(who=\"test\", obj=\"lol\");");
		AnsiConsole.systemUninstall();
	}

	public Visitors visitors;
	public Map<String, BiConsumer<Cbpl, Map<String, Object>>> functions;
	public List<CompileResult> compiled;

	public Cbpl() {
		visitors = new Visitors(this);
		functions = new HashMap<String, BiConsumer<Cbpl, Map<String, Object>>>();
		compiled = new ArrayList<CompileResult>();
		/* Built-in Functions */
		functions.put("say", (cbpl, args) -> compiled.add(new CompileResult(CHAIN,
				String.format("/tellraw %s {text:\"%s\"}", args.get("who"), args.get("obj")))));
=======
		try {
			new Cbpl("x = 5 + 5\r\n" + 
		        " y=20\n"+
				"##\n" + 
		        "function(a,b,c)").run();
		} catch (CbplException e) {
			System.err.println("Error: " + e.getMessage());
			System.err.println("Row " + e.row + ", Col " + e.col);
		}
	}
	
	public String content;
	public Line[] lines;
	
	public Cbpl(String content) throws CbplException {
		this.content = content;
		this.lines = Token.tokenize(this.content);
	}
	
	public void run() {
		for (Line line : lines) {
			System.out.println(line.toString());
		}
>>>>>>> refs/remotes/origin/master
	}
<<<<<<< HEAD

	public void interpret(String code) {
		CBPLLexer lexer = new CBPLLexer(new ANTLRInputStream(code));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CBPLParser parser = new CBPLParser(tokens);
		parser.setBuildParseTree(true);
		ProgramContext tree = parser.program();
		tree.accept(visitors.mainVisitor);
	}

=======
>>>>>>> refs/remotes/origin/master
}
