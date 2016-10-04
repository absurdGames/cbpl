// Generated from CBPL.g4 by ANTLR 4.5.3
package org.absurd.cbpl.parsing;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CBPLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CBPLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CBPLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CBPLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#cbplVersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCbplVersion(CBPLParser.CbplVersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(CBPLParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#selectorKeyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorKeyValuePair(CBPLParser.SelectorKeyValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#selectorValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorValue(CBPLParser.SelectorValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#letter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetter(CBPLParser.LetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(CBPLParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#jsonKeyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonKeyValuePair(CBPLParser.JsonKeyValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#jsonKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonKey(CBPLParser.JsonKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValue(CBPLParser.JsonValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#jsonArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArray(CBPLParser.JsonArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallStatement}
	 * labeled alternative in {@link CBPLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(CBPLParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setVariableStatement}
	 * labeled alternative in {@link CBPLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariableStatement(CBPLParser.SetVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setCompileTimeVariableStatement}
	 * labeled alternative in {@link CBPLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCompileTimeVariableStatement(CBPLParser.SetCompileTimeVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#lineTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineTerminator(CBPLParser.LineTerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#argsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsList(CBPLParser.ArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(CBPLParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#dotNotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotNotation(CBPLParser.DotNotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CBPLParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#coord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoord(CBPLParser.CoordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#floatingNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingNumber(CBPLParser.FloatingNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CBPLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(CBPLParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(CBPLParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(CBPLParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code coordExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordExpr(CBPLParser.CoordExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsonExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonExpr(CBPLParser.JsonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectorExpr}
	 * labeled alternative in {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorExpr(CBPLParser.SelectorExprContext ctx);
}