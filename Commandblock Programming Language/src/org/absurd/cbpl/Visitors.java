package org.absurd.cbpl;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

import org.absurd.cbpl.parsing.CBPLBaseVisitor;
import org.absurd.cbpl.parsing.CBPLParser.ArgContext;
import org.absurd.cbpl.parsing.CBPLParser.FunctionCallStatementContext;
import org.absurd.cbpl.parsing.CBPLParser.NumberExprContext;
import org.absurd.cbpl.parsing.CBPLParser.ProgramContext;
import org.absurd.cbpl.parsing.CBPLParser.SetVariableStatementContext;
import org.absurd.cbpl.parsing.CBPLParser.StringExprContext;
import org.absurd.cbpl.parsing.CBPLParser.VarExprContext;

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
			ctx.statement().forEach(stmt -> stmtVisitor.visit(stmt));
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
			if(cbpl.compileNames.containsKey(ctx.IDENTIFIER().getText()))
				compiledVarName = cbpl.compileNames.get(ctx.IDENTIFIER().getText());
			else {
				compiledVarName = cbpl.scriptName + cbpl.compileNames.size();
				cbpl.compileNames.put(ctx.IDENTIFIER().getText(), compiledVarName);
				cbpl.compiled.add(new CompileResult(CompileResult.CHAIN, "/scoreboard objectives add " + compiledVarName + " dummy " + compiledVarName));
				
			}
			return null;
		}
	}

	private class ExprVisitor extends CBPLBaseVisitor<Variable> {
		public Variable visitNumberExpr(NumberExprContext ctx) {
			return new Variable(ctx.number().value);
		}

		public Variable visitStringExpr(StringExprContext ctx) {
			return new Variable(ctx.string().value);
		}
		
		public Variable visitVarExpr(VarExprContext ctx) {
			return new Variable(String.format("{\"score\":{\"name\":\"%s\",\"objective\":\"%s\"}}", cbpl.scriptName, cbpl.compileNames.get(ctx.IDENTIFIER().getText())), true);
		}
	}

}
