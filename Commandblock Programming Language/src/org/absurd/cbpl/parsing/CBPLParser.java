// Generated from CBPL.g4 by ANTLR 4.5.3
package org.absurd.cbpl.parsing;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CBPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, FLOATING_NUMBER=9, 
		NUMBER=10, STRING=11, IDENTIFIER=12, WHITESPACE=13;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_lineTerminator = 2, RULE_argsList = 3, 
		RULE_arg = 4, RULE_dotNotation = 5, RULE_number = 6, RULE_coord = 7, RULE_floatingNumber = 8, 
		RULE_string = 9, RULE_expr = 10;
	public static final String[] ruleNames = {
		"program", "statement", "lineTerminator", "argsList", "arg", "dotNotation", 
		"number", "coord", "floatingNumber", "string", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'='", "'~='", "';'", "','", "'.'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "FLOATING_NUMBER", 
		"NUMBER", "STRING", "IDENTIFIER", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CBPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CBPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallStatementContext extends StatementContext {
		public TerminalNode IDENTIFIER() { return getToken(CBPLParser.IDENTIFIER, 0); }
		public ArgsListContext argsList() {
			return getRuleContext(ArgsListContext.class,0);
		}
		public LineTerminatorContext lineTerminator() {
			return getRuleContext(LineTerminatorContext.class,0);
		}
		public FunctionCallStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetFinalVariableStatementContext extends StatementContext {
		public TerminalNode IDENTIFIER() { return getToken(CBPLParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LineTerminatorContext lineTerminator() {
			return getRuleContext(LineTerminatorContext.class,0);
		}
		public SetFinalVariableStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterSetFinalVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitSetFinalVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitSetFinalVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetVariableStatementContext extends StatementContext {
		public TerminalNode IDENTIFIER() { return getToken(CBPLParser.IDENTIFIER, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LineTerminatorContext lineTerminator() {
			return getRuleContext(LineTerminatorContext.class,0);
		}
		public SetVariableStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterSetVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitSetVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitSetVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new FunctionCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(IDENTIFIER);
				setState(29);
				match(T__0);
				setState(30);
				argsList();
				setState(31);
				match(T__1);
				setState(32);
				lineTerminator();
				}
				break;
			case 2:
				_localctx = new SetVariableStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(IDENTIFIER);
				setState(35);
				match(T__2);
				setState(36);
				number();
				setState(37);
				lineTerminator();
				}
				break;
			case 3:
				_localctx = new SetFinalVariableStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(IDENTIFIER);
				setState(40);
				match(T__3);
				setState(41);
				expr();
				setState(42);
				lineTerminator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineTerminatorContext extends ParserRuleContext {
		public LineTerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineTerminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterLineTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitLineTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitLineTerminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineTerminatorContext lineTerminator() throws RecognitionException {
		LineTerminatorContext _localctx = new LineTerminatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lineTerminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsListContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsListContext argsList() throws RecognitionException {
		ArgsListContext _localctx = new ArgsListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			arg();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(49);
				match(T__5);
				setState(50);
				arg();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CBPLParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(IDENTIFIER);
			setState(57);
			match(T__2);
			setState(58);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotNotationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CBPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CBPLParser.IDENTIFIER, i);
		}
		public DotNotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotNotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterDotNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitDotNotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitDotNotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotNotationContext dotNotation() throws RecognitionException {
		DotNotationContext _localctx = new DotNotationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dotNotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(IDENTIFIER);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				match(T__6);
				setState(62);
				match(IDENTIFIER);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public int value;
		public Token internalValue;
		public TerminalNode NUMBER() { return getToken(CBPLParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((NumberContext)_localctx).internalValue = match(NUMBER);
			((NumberContext)_localctx).value =  Integer.parseInt(((NumberContext)_localctx).internalValue.getText());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoordContext extends ParserRuleContext {
		public TerminalNode FLOATING_NUMBER() { return getToken(CBPLParser.FLOATING_NUMBER, 0); }
		public CoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterCoord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitCoord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitCoord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordContext coord() throws RecognitionException {
		CoordContext _localctx = new CoordContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_coord);
		try {
			setState(73);
			switch (_input.LA(1)) {
			case FLOATING_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(FLOATING_NUMBER);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__7);
				setState(72);
				match(FLOATING_NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingNumberContext extends ParserRuleContext {
		public double value;
		public Token internalValue;
		public TerminalNode NUMBER() { return getToken(CBPLParser.NUMBER, 0); }
		public FloatingNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterFloatingNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitFloatingNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitFloatingNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingNumberContext floatingNumber() throws RecognitionException {
		FloatingNumberContext _localctx = new FloatingNumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_floatingNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((FloatingNumberContext)_localctx).internalValue = match(NUMBER);
			((FloatingNumberContext)_localctx).value =  Double.parseDouble(((FloatingNumberContext)_localctx).internalValue.getText());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public String value;
		public Token internalValue;
		public TerminalNode STRING() { return getToken(CBPLParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((StringContext)_localctx).internalValue = match(STRING);
			((StringContext)_localctx).value =  ((StringContext)_localctx).internalValue.getText().substring(1, ((StringContext)_localctx).internalValue.getText().length() - 1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringExprContext extends ExprContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExprContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(CBPLParser.IDENTIFIER, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExprContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoordExprContext extends ExprContext {
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public CoordExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterCoordExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitCoordExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitCoordExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(85);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				number();
				}
				break;
			case STRING:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				string();
				}
				break;
			case IDENTIFIER:
				_localctx = new VarExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(IDENTIFIER);
				}
				break;
			case T__7:
			case FLOATING_NUMBER:
				_localctx = new CoordExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				coord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17Z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\5\3\5\3\5\7\5\66\n"+
		"\5\f\5\16\59\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\6\7B\n\7\r\7\16\7C\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\5\tL\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\5\fX\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2W\2\33\3\2\2\2\4.\3"+
		"\2\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n:\3\2\2\2\f>\3\2\2\2\16E\3\2\2\2\20"+
		"K\3\2\2\2\22M\3\2\2\2\24P\3\2\2\2\26W\3\2\2\2\30\32\5\4\3\2\31\30\3\2"+
		"\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\33\3\2"+
		"\2\2\36\37\7\16\2\2\37 \7\3\2\2 !\5\b\5\2!\"\7\4\2\2\"#\5\6\4\2#/\3\2"+
		"\2\2$%\7\16\2\2%&\7\5\2\2&\'\5\16\b\2\'(\5\6\4\2(/\3\2\2\2)*\7\16\2\2"+
		"*+\7\6\2\2+,\5\26\f\2,-\5\6\4\2-/\3\2\2\2.\36\3\2\2\2.$\3\2\2\2.)\3\2"+
		"\2\2/\5\3\2\2\2\60\61\7\7\2\2\61\7\3\2\2\2\62\67\5\n\6\2\63\64\7\b\2\2"+
		"\64\66\5\n\6\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\t"+
		"\3\2\2\29\67\3\2\2\2:;\7\16\2\2;<\7\5\2\2<=\5\26\f\2=\13\3\2\2\2>A\7\16"+
		"\2\2?@\7\t\2\2@B\7\16\2\2A?\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\r\3"+
		"\2\2\2EF\7\f\2\2FG\b\b\1\2G\17\3\2\2\2HL\7\13\2\2IJ\7\n\2\2JL\7\13\2\2"+
		"KH\3\2\2\2KI\3\2\2\2L\21\3\2\2\2MN\7\f\2\2NO\b\n\1\2O\23\3\2\2\2PQ\7\r"+
		"\2\2QR\b\13\1\2R\25\3\2\2\2SX\5\16\b\2TX\5\24\13\2UX\7\16\2\2VX\5\20\t"+
		"\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\27\3\2\2\2\b\33.\67CKW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}