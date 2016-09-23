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
	 * Visit a parse tree produced by the {@code functionCallStatement}
	 * labeled alternative in {@link CBPLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(CBPLParser.FunctionCallStatementContext ctx);
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
	 * Visit a parse tree produced by {@link CBPLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CBPLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(CBPLParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBPLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CBPLParser.ExprContext ctx);
}