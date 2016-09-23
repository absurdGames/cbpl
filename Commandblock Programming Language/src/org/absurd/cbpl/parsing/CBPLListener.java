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
	 * Enter a parse tree produced by {@link CBPLParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(CBPLParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(CBPLParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CBPLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CBPLParser.ExprContext ctx);
}