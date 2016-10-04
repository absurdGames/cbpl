package org.absurd.cbpl;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

import org.absurd.cbpl.parsing.CBPLBaseVisitor;
import org.absurd.cbpl.parsing.CBPLParser.ArgContext;
import org.absurd.cbpl.parsing.CBPLParser.CbplVersionContext;
import org.absurd.cbpl.parsing.CBPLParser.FunctionCallStatementContext;
import org.absurd.cbpl.parsing.CBPLParser.JsonExprContext;
import org.absurd.cbpl.parsing.CBPLParser.NumberExprContext;
import org.absurd.cbpl.parsing.CBPLParser.ProgramContext;
import org.absurd.cbpl.parsing.CBPLParser.SelectorExprContext;
import org.absurd.cbpl.parsing.CBPLParser.SetCompileTimeVariableStatementContext;
import org.absurd.cbpl.parsing.CBPLParser.SetVariableStatementContext;
import org.absurd.cbpl.parsing.CBPLParser.StringExprContext;
import org.absurd.cbpl.parsing.CBPLParser.VarExprContext;
import org.apache.commons.lang3.StringEscapeUtils;

public class Visitors {

	public final Cbpl cbpl;

	public StatementVisitor stmtVisitor;
	public MainVisitor mainVisitor;
	public ExprVisitor exprVisitor;

	public Visitors(Cbpl cbpl) {
		this.cbpl = cbpl;
		this.stmtVisitor = new StatementVisitor();
		this.mainVisitor = new MainVisitor();
		this.exprVisitor = new ExprVisitor();
	}

	private class MainVisitor extends CBPLBaseVisitor<Void> {
		public Void visitProgram(ProgramContext ctx) {
			if (ctx.cbplVersion() == null || ctx.cbplVersion().number() == null)
				System.exit(0);
			visit(ctx.cbplVersion());
			ctx.statement().forEach(stmt -> stmtVisitor.visit(stmt));
			return null;
		}

		public Void visitCbplVersion(CbplVersionContext ctx) {
			if (ctx.number().value != Cbpl.MAJOR_VERSION) {
				System.err.println("Invalid CBPL major version: " + ctx.number().value);
				System.exit(0);
			}
			return null;
		}
	}

	private class StatementVisitor extends CBPLBaseVisitor<Void> {
		public Void visitFunctionCallStatement(FunctionCallStatementContext ctx) {
			BiConsumer<Cbpl, Map<String, Variable>> func = cbpl.functions.get(ctx.IDENTIFIER().getText());
			HashMap<String, Variable> args = new HashMap<String, Variable>();
			for (ArgContext arg : ctx.argsList().arg())
				args.put(arg.IDENTIFIER().getText(), exprVisitor.visit(arg.expr()));
			func.accept(cbpl, args);
			return null;
		}

		public Void visitSetVariableStatement(SetVariableStatementContext ctx) {
			boolean firstVar = false;
			while (cbpl.scriptName.trim().isEmpty()) {
				firstVar = true;
				cbpl.getScriptName();
			}
			if (firstVar) {
				cbpl.compiled.add(
						new CompileResult(CompileResult.CHAIN, String.format(Cbpl.SETUP_ARMOR_STAND, cbpl.scriptName)));
			}
			String compiledVarName;
			if (cbpl.compileNames.containsKey(ctx.IDENTIFIER().getText()))
				compiledVarName = cbpl.compileNames.get(ctx.IDENTIFIER().getText());
			else {
				compiledVarName = cbpl.scriptName + cbpl.compileNames.size();
				cbpl.compileNames.put(ctx.IDENTIFIER().getText(), compiledVarName);
				cbpl.compiled.add(new CompileResult(CompileResult.CHAIN,
						"/scoreboard objectives add " + compiledVarName + " dummy " + compiledVarName));
				cbpl.compiled.add(new CompileResult(CompileResult.CHAIN, "/scoreboard players set "
						+ cbpl.armorStandSelector + " " + compiledVarName + " " + ctx.number().value));
			}
			return null;
		}

		public Void visitSetCompileTimeVariableStatement(SetCompileTimeVariableStatementContext ctx) {
			cbpl.compileTimeVars.put(ctx.IDENTIFIER().getText(), exprVisitor.visit(ctx.expr()));
			return null;
		}
	}

	private class ExprVisitor extends CBPLBaseVisitor<Variable> {
		public Variable visitNumberExpr(NumberExprContext ctx) {
			return new Variable(ctx.number().value);
		}

		public Variable visitStringExpr(StringExprContext ctx) {
			return new Variable(StringEscapeUtils.unescapeJava(ctx.string().value));
		}

		public Variable visitJsonExpr(JsonExprContext ctx) {
			return new Variable(ctx.jsonObject().getText(), true);
		}

		public Variable visitSelectorExpr(SelectorExprContext ctx) {
			return new Variable(ctx.selector().getText(), true);
		}

		public Variable visitVarExpr(VarExprContext ctx) {
			return new Variable(String.format("{\"score\":{\"name\":\"%s\",\"objective\":\"%s\"}}", cbpl.scriptName,
					cbpl.compileNames.get(ctx.IDENTIFIER().getText())), true);
		}
	}

}
