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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, FLOATING_NUMBER=17, 
		NUMBER=18, STRING=19, IDENTIFIER=20, WHITESPACE=21;
	public static final int
		RULE_program = 0, RULE_cbplVersion = 1, RULE_selector = 2, RULE_selectorKeyValuePair = 3, 
		RULE_selectorValue = 4, RULE_letter = 5, RULE_jsonObject = 6, RULE_jsonKeyValuePair = 7, 
		RULE_jsonKey = 8, RULE_jsonValue = 9, RULE_jsonArray = 10, RULE_statement = 11, 
		RULE_lineTerminator = 12, RULE_argsList = 13, RULE_arg = 14, RULE_dotNotation = 15, 
		RULE_number = 16, RULE_coord = 17, RULE_floatingNumber = 18, RULE_string = 19, 
		RULE_expr = 20;
	public static final String[] ruleNames = {
		"program", "cbplVersion", "selector", "selectorKeyValuePair", "selectorValue", 
		"letter", "jsonObject", "jsonKeyValuePair", "jsonKey", "jsonValue", "jsonArray", 
		"statement", "lineTerminator", "argsList", "arg", "dotNotation", "number", 
		"coord", "floatingNumber", "string", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'cbpl'", "'@'", "'['", "','", "']'", "'='", "'!'", "'{'", "'}'", 
		"':'", "'('", "')'", "'~='", "';'", "'.'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "FLOATING_NUMBER", "NUMBER", "STRING", "IDENTIFIER", 
		"WHITESPACE"
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
		public CbplVersionContext cbplVersion() {
			return getRuleContext(CbplVersionContext.class,0);
		}
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
			setState(42);
			cbplVersion();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(43);
				statement();
				}
				}
				setState(48);
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

	public static class CbplVersionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LineTerminatorContext lineTerminator() {
			return getRuleContext(LineTerminatorContext.class,0);
		}
		public CbplVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cbplVersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterCbplVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitCbplVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitCbplVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CbplVersionContext cbplVersion() throws RecognitionException {
		CbplVersionContext _localctx = new CbplVersionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cbplVersion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
			number();
			setState(51);
			lineTerminator();
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

	public static class SelectorContext extends ParserRuleContext {
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public List<SelectorKeyValuePairContext> selectorKeyValuePair() {
			return getRuleContexts(SelectorKeyValuePairContext.class);
		}
		public SelectorKeyValuePairContext selectorKeyValuePair(int i) {
			return getRuleContext(SelectorKeyValuePairContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__1);
			setState(54);
			letter();
			setState(66);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(55);
				match(T__2);
				setState(56);
				selectorKeyValuePair();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(57);
					match(T__3);
					setState(58);
					selectorKeyValuePair();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(T__4);
				}
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

	public static class SelectorKeyValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CBPLParser.IDENTIFIER, 0); }
		public SelectorValueContext selectorValue() {
			return getRuleContext(SelectorValueContext.class,0);
		}
		public SelectorKeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorKeyValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterSelectorKeyValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitSelectorKeyValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitSelectorKeyValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorKeyValuePairContext selectorKeyValuePair() throws RecognitionException {
		SelectorKeyValuePairContext _localctx = new SelectorKeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectorKeyValuePair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(IDENTIFIER);
			setState(69);
			match(T__5);
			setState(71);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(70);
				match(T__6);
				}
			}

			setState(73);
			selectorValue();
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

	public static class SelectorValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CBPLParser.IDENTIFIER, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SelectorValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterSelectorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitSelectorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitSelectorValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorValueContext selectorValue() throws RecognitionException {
		SelectorValueContext _localctx = new SelectorValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectorValue);
		try {
			setState(77);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				number();
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

	public static class LetterContext extends ParserRuleContext {
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitLetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_letter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			matchWildcard();
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

	public static class JsonObjectContext extends ParserRuleContext {
		public List<JsonKeyValuePairContext> jsonKeyValuePair() {
			return getRuleContexts(JsonKeyValuePairContext.class);
		}
		public JsonKeyValuePairContext jsonKeyValuePair(int i) {
			return getRuleContext(JsonKeyValuePairContext.class,i);
		}
		public JsonObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterJsonObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitJsonObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitJsonObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonObjectContext jsonObject() throws RecognitionException {
		JsonObjectContext _localctx = new JsonObjectContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jsonObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__7);
			setState(82);
			jsonKeyValuePair();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(83);
				match(T__3);
				setState(84);
				jsonKeyValuePair();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(T__8);
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

	public static class JsonKeyValuePairContext extends ParserRuleContext {
		public JsonKeyContext jsonKey() {
			return getRuleContext(JsonKeyContext.class,0);
		}
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public JsonKeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonKeyValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterJsonKeyValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitJsonKeyValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitJsonKeyValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonKeyValuePairContext jsonKeyValuePair() throws RecognitionException {
		JsonKeyValuePairContext _localctx = new JsonKeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jsonKeyValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			jsonKey();
			setState(93);
			match(T__9);
			setState(94);
			jsonValue();
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

	public static class JsonKeyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CBPLParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CBPLParser.IDENTIFIER, 0); }
		public JsonKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterJsonKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitJsonKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitJsonKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonKeyContext jsonKey() throws RecognitionException {
		JsonKeyContext _localctx = new JsonKeyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jsonKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class JsonValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CBPLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(CBPLParser.NUMBER, 0); }
		public JsonObjectContext jsonObject() {
			return getRuleContext(JsonObjectContext.class,0);
		}
		public JsonArrayContext jsonArray() {
			return getRuleContext(JsonArrayContext.class,0);
		}
		public JsonValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterJsonValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitJsonValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitJsonValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonValueContext jsonValue() throws RecognitionException {
		JsonValueContext _localctx = new JsonValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jsonValue);
		try {
			setState(102);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(NUMBER);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				jsonObject();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				jsonArray();
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

	public static class JsonArrayContext extends ParserRuleContext {
		public List<JsonValueContext> jsonValue() {
			return getRuleContexts(JsonValueContext.class);
		}
		public JsonValueContext jsonValue(int i) {
			return getRuleContext(JsonValueContext.class,i);
		}
		public JsonArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterJsonArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitJsonArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitJsonArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonArrayContext jsonArray() throws RecognitionException {
		JsonArrayContext _localctx = new JsonArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jsonArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__2);
			setState(113);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(105);
				jsonValue();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(106);
					match(T__3);
					setState(107);
					jsonValue();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(115);
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
	public static class SetCompileTimeVariableStatementContext extends StatementContext {
		public TerminalNode IDENTIFIER() { return getToken(CBPLParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LineTerminatorContext lineTerminator() {
			return getRuleContext(LineTerminatorContext.class,0);
		}
		public SetCompileTimeVariableStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterSetCompileTimeVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitSetCompileTimeVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitSetCompileTimeVariableStatement(this);
			else return visitor.visitChildren(this);
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
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new FunctionCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(IDENTIFIER);
				setState(118);
				match(T__10);
				setState(119);
				argsList();
				setState(120);
				match(T__11);
				setState(121);
				lineTerminator();
				}
				break;
			case 2:
				_localctx = new SetVariableStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(IDENTIFIER);
				setState(124);
				match(T__5);
				setState(125);
				number();
				setState(126);
				lineTerminator();
				}
				break;
			case 3:
				_localctx = new SetCompileTimeVariableStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(IDENTIFIER);
				setState(129);
				match(T__12);
				setState(130);
				expr();
				setState(131);
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
		enterRule(_localctx, 24, RULE_lineTerminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__13);
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
		enterRule(_localctx, 26, RULE_argsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			arg();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(138);
				match(T__3);
				setState(139);
				arg();
				}
				}
				setState(144);
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
		enterRule(_localctx, 28, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(IDENTIFIER);
			setState(146);
			match(T__5);
			setState(147);
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
		enterRule(_localctx, 30, RULE_dotNotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IDENTIFIER);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				match(T__14);
				setState(151);
				match(IDENTIFIER);
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
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
		enterRule(_localctx, 32, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		enterRule(_localctx, 34, RULE_coord);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case FLOATING_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(FLOATING_NUMBER);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__15);
				setState(161);
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
		enterRule(_localctx, 36, RULE_floatingNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
		enterRule(_localctx, 38, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
	public static class SelectorExprContext extends ExprContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public SelectorExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterSelectorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitSelectorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitSelectorExpr(this);
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
	public static class JsonExprContext extends ExprContext {
		public JsonObjectContext jsonObject() {
			return getRuleContext(JsonObjectContext.class,0);
		}
		public JsonExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).enterJsonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBPLListener ) ((CBPLListener)listener).exitJsonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBPLVisitor ) return ((CBPLVisitor<? extends T>)visitor).visitJsonExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr);
		try {
			setState(176);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				number();
				}
				break;
			case STRING:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				string();
				}
				break;
			case IDENTIFIER:
				_localctx = new VarExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(IDENTIFIER);
				}
				break;
			case T__15:
			case FLOATING_NUMBER:
				_localctx = new CoordExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				coord();
				}
				break;
			case T__7:
				_localctx = new JsonExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				jsonObject();
				}
				break;
			case T__1:
				_localctx = new SelectorExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				selector();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u00b5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4"+
		"\3\4\3\4\5\4E\n\4\3\5\3\5\3\5\5\5J\n\5\3\5\3\5\3\6\3\6\5\6P\n\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\7\bX\n\b\f\b\16\b[\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\5\13i\n\13\3\f\3\f\3\f\3\f\7\fo\n\f\f\f\16\f"+
		"r\13\f\5\ft\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0088\n\r\3\16\3\16\3\17\3\17\3\17\7\17\u008f\n"+
		"\17\f\17\16\17\u0092\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\6\21\u009b"+
		"\n\21\r\21\16\21\u009c\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00a5\n\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00b3"+
		"\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\3"+
		"\2\25\26\u00b4\2,\3\2\2\2\4\63\3\2\2\2\6\67\3\2\2\2\bF\3\2\2\2\nO\3\2"+
		"\2\2\fQ\3\2\2\2\16S\3\2\2\2\20^\3\2\2\2\22b\3\2\2\2\24h\3\2\2\2\26j\3"+
		"\2\2\2\30\u0087\3\2\2\2\32\u0089\3\2\2\2\34\u008b\3\2\2\2\36\u0093\3\2"+
		"\2\2 \u0097\3\2\2\2\"\u009e\3\2\2\2$\u00a4\3\2\2\2&\u00a6\3\2\2\2(\u00a9"+
		"\3\2\2\2*\u00b2\3\2\2\2,\60\5\4\3\2-/\5\30\r\2.-\3\2\2\2/\62\3\2\2\2\60"+
		".\3\2\2\2\60\61\3\2\2\2\61\3\3\2\2\2\62\60\3\2\2\2\63\64\7\3\2\2\64\65"+
		"\5\"\22\2\65\66\5\32\16\2\66\5\3\2\2\2\678\7\4\2\28D\5\f\7\29:\7\5\2\2"+
		":?\5\b\5\2;<\7\6\2\2<>\5\b\5\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2"+
		"@B\3\2\2\2A?\3\2\2\2BC\7\7\2\2CE\3\2\2\2D9\3\2\2\2DE\3\2\2\2E\7\3\2\2"+
		"\2FG\7\26\2\2GI\7\b\2\2HJ\7\t\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\5\n"+
		"\6\2L\t\3\2\2\2MP\7\26\2\2NP\5\"\22\2OM\3\2\2\2ON\3\2\2\2P\13\3\2\2\2"+
		"QR\13\2\2\2R\r\3\2\2\2ST\7\n\2\2TY\5\20\t\2UV\7\6\2\2VX\5\20\t\2WU\3\2"+
		"\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\13\2\2]\17"+
		"\3\2\2\2^_\5\22\n\2_`\7\f\2\2`a\5\24\13\2a\21\3\2\2\2bc\t\2\2\2c\23\3"+
		"\2\2\2di\7\25\2\2ei\7\24\2\2fi\5\16\b\2gi\5\26\f\2hd\3\2\2\2he\3\2\2\2"+
		"hf\3\2\2\2hg\3\2\2\2i\25\3\2\2\2js\7\5\2\2kp\5\24\13\2lm\7\6\2\2mo\5\24"+
		"\13\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2sk\3"+
		"\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\7\2\2v\27\3\2\2\2wx\7\26\2\2xy\7\r\2\2"+
		"yz\5\34\17\2z{\7\16\2\2{|\5\32\16\2|\u0088\3\2\2\2}~\7\26\2\2~\177\7\b"+
		"\2\2\177\u0080\5\"\22\2\u0080\u0081\5\32\16\2\u0081\u0088\3\2\2\2\u0082"+
		"\u0083\7\26\2\2\u0083\u0084\7\17\2\2\u0084\u0085\5*\26\2\u0085\u0086\5"+
		"\32\16\2\u0086\u0088\3\2\2\2\u0087w\3\2\2\2\u0087}\3\2\2\2\u0087\u0082"+
		"\3\2\2\2\u0088\31\3\2\2\2\u0089\u008a\7\20\2\2\u008a\33\3\2\2\2\u008b"+
		"\u0090\5\36\20\2\u008c\u008d\7\6\2\2\u008d\u008f\5\36\20\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\35\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\26\2\2\u0094\u0095\7\b\2"+
		"\2\u0095\u0096\5*\26\2\u0096\37\3\2\2\2\u0097\u009a\7\26\2\2\u0098\u0099"+
		"\7\21\2\2\u0099\u009b\7\26\2\2\u009a\u0098\3\2\2\2\u009b\u009c\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d!\3\2\2\2\u009e\u009f\7"+
		"\24\2\2\u009f\u00a0\b\22\1\2\u00a0#\3\2\2\2\u00a1\u00a5\7\23\2\2\u00a2"+
		"\u00a3\7\22\2\2\u00a3\u00a5\7\23\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a5%\3\2\2\2\u00a6\u00a7\7\24\2\2\u00a7\u00a8\b\24\1\2\u00a8"+
		"\'\3\2\2\2\u00a9\u00aa\7\25\2\2\u00aa\u00ab\b\25\1\2\u00ab)\3\2\2\2\u00ac"+
		"\u00b3\5\"\22\2\u00ad\u00b3\5(\25\2\u00ae\u00b3\7\26\2\2\u00af\u00b3\5"+
		"$\23\2\u00b0\u00b3\5\16\b\2\u00b1\u00b3\5\6\4\2\u00b2\u00ac\3\2\2\2\u00b2"+
		"\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b3+\3\2\2\2\20\60?DIOYhps\u0087\u0090\u009c"+
		"\u00a4\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}