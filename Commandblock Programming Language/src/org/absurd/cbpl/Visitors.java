package org.absurd.cbpl;

import org.absurd.cbpl.parsing.CBPLBaseVisitor;
import org.absurd.cbpl.parsing.CBPLParser.FunctionCallStatementContext;
import org.absurd.cbpl.parsing.CBPLParser.ProgramContext;

public class Visitors {
	
	public final Cbpl cbpl;
	
	public StatementVisitor stmtVisitor;
	public MainVisitor mainVisitor;
	
	public Visitors(Cbpl cbpl) {
		this.cbpl = cbpl;
		this.stmtVisitor = new StatementVisitor();
		this.mainVisitor = new MainVisitor();
	}
	
	private class MainVisitor extends CBPLBaseVisitor<Void> {
		public Void visitProgram(ProgramContext ctx) {
			ctx.statement().forEach(stmt -> stmtVisitor.visit(stmt));
			return null;
		}
	}
	
	private class StatementVisitor extends CBPLBaseVisitor<Object> {
		public Object visitFunctionCallStatement(FunctionCallStatementContext ctx) {
			return null;
		}
	}
	
}
