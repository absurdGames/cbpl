// Generated from CBPL.g4 by ANTLR 4.5.3
package org.absurd.cbpl.parsing;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CBPLParser}.
 */
public interface CBPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CBPLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CBPLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CBPLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallStatement}
	 * labeled alternative in {@link CBPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(CBPLParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallStatement}
	 * labeled alternative in {@link CBPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(CBPLParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setVariableStatement}
	 * labeled alternative in {@link CBPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetVariableStatement(CBPLParser.SetVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setVariableStatement}
	 * labeled alternative in {@link CBPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetVariableStatement(CBPLParser.SetVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setFinalVariableStatement}
	 * labeled alternative in {@link CBPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetFinalVariableStatement(CBPLParser.SetFinalVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setFinalVariableStatement}
	 * labeled alternative in {@link CBPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetFinalVariableStatement(CBPLParser.SetFinalVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#lineTerminator}.
	 * @param ctx the parse tree
	 */
	void enterLineTerminator(CBPLParser.LineTerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#lineTerminator}.
	 * @param ctx the parse tree
	 */
	void exitLineTerminator(CBPLParser.LineTerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#argsList}.
	 * @param ctx the parse tree
	 */
	void enterArgsList(CBPLParser.ArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#argsList}.
	 * @param ctx the parse tree
	 */
	void exitArgsList(CBPLParser.ArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(CBPLParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(CBPLParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#dotNotation}.
	 * @param ctx the parse tree
	 */
	void enterDotNotation(CBPLParser.DotNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#dotNotation}.
	 * @param ctx the parse tree
	 */
	void exitDotNotation(CBPLParser.DotNotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CBPLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CBPLParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#coord}.
	 * @param ctx the parse tree
	 */
	void enterCoord(CBPLParser.CoordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#coord}.
	 * @param ctx the parse tree
	 */
	void exitCoord(CBPLParser.CoordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#floatingNumber}.
	 * @param ctx the parse tree
	 */
	void enterFloatingNumber(CBPLParser.FloatingNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#floatingNumber}.
	 * @param ctx the parse tree
	 */
	void exitFloatingNumber(CBPLParser.FloatingNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(CBPLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(CBPLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(CBPLParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(CBPLParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(CBPLParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(CBPLParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(CBPLParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(CBPLParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code coordExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCoordExpr(CBPLParser.CoordExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code coordExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCoordExpr(CBPLParser.CoordExprContext ctx);
}