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
	 * Enter a parse tree produced by {@link CBPLParser#cbplVersion}.
	 * @param ctx the parse tree
	 */
	void enterCbplVersion(CBPLParser.CbplVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#cbplVersion}.
	 * @param ctx the parse tree
	 */
	void exitCbplVersion(CBPLParser.CbplVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(CBPLParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(CBPLParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#selectorKeyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterSelectorKeyValuePair(CBPLParser.SelectorKeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#selectorKeyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitSelectorKeyValuePair(CBPLParser.SelectorKeyValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#selectorValue}.
	 * @param ctx the parse tree
	 */
	void enterSelectorValue(CBPLParser.SelectorValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#selectorValue}.
	 * @param ctx the parse tree
	 */
	void exitSelectorValue(CBPLParser.SelectorValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(CBPLParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(CBPLParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void enterJsonObject(CBPLParser.JsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void exitJsonObject(CBPLParser.JsonObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#jsonKeyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterJsonKeyValuePair(CBPLParser.JsonKeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#jsonKeyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitJsonKeyValuePair(CBPLParser.JsonKeyValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#jsonKey}.
	 * @param ctx the parse tree
	 */
	void enterJsonKey(CBPLParser.JsonKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#jsonKey}.
	 * @param ctx the parse tree
	 */
	void exitJsonKey(CBPLParser.JsonKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonValue(CBPLParser.JsonValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonValue(CBPLParser.JsonValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBPLParser#jsonArray}.
	 * @param ctx the parse tree
	 */
	void enterJsonArray(CBPLParser.JsonArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBPLParser#jsonArray}.
	 * @param ctx the parse tree
	 */
	void exitJsonArray(CBPLParser.JsonArrayContext ctx);
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
	 * Enter a parse tree produced by the {@code setCompileTimeVariableStatement}
	 * labeled alternative in {@link CBPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetCompileTimeVariableStatement(CBPLParser.SetCompileTimeVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setCompileTimeVariableStatement}
	 * labeled alternative in {@link CBPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetCompileTimeVariableStatement(CBPLParser.SetCompileTimeVariableStatementContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code jsonExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterJsonExpr(CBPLParser.JsonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitJsonExpr(CBPLParser.JsonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectorExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelectorExpr(CBPLParser.SelectorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectorExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelectorExpr(CBPLParser.SelectorExprContext ctx);
}