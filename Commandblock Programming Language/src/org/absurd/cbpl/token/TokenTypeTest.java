package org.absurd.cbpl.token;

import static org.absurd.cbpl.token.TokenType.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TokenTypeTest {
	@Test
	public void testString() {
		assertEquals(TokenType.STRING, fromInput("\"test string \\\"\""));
	}
	@Test
	public void testNumber() {
		assertEquals(TokenType.NUMBER, fromInput("1"));
		assertEquals(TokenType.NUMBER, fromInput("-123"));
		assertEquals(TokenType.NUMBER, fromInput("123.456"));
		assertEquals(TokenType.NUMBER, fromInput("123.456e789"));
		assertEquals(TokenType.NUMBER, fromInput("123.456e+789"));
		assertEquals(TokenType.NUMBER, fromInput("123e789"));
		
		assertEquals(null,  fromInput("123.+456"));
	}
	@Test
	public void testIdentifier() {
		assertEquals(TokenType.IDENTIFIER, fromInput("x"));
		assertEquals(TokenType.IDENTIFIER, fromInput("ab123cd"));
		assertEquals(TokenType.IDENTIFIER, fromInput("ab123cd_abcd"));
		assertEquals(TokenType.IDENTIFIER, fromInput("_abcd"));
		
		assertEquals(null, fromInput("1abcd"));
	}
	@Test
	public void testSymbols() {
		assertEquals(TokenType.OADD, fromInput("+"));
		assertEquals(TokenType.OSUB, fromInput("-"));
		assertEquals(TokenType.OMUL, fromInput("*"));
		assertEquals(TokenType.ODIV, fromInput("/"));
		assertEquals(TokenType.OMOD, fromInput("%"));
		assertEquals(TokenType.OEXP, fromInput("^"));
		assertEquals(TokenType.OASSIGN, fromInput("="));
		assertEquals(TokenType.ONONEQUALS, fromInput("!="));
		assertEquals(TokenType.OEQUALS, fromInput("=="));
		assertEquals(TokenType.OGT, fromInput(">"));
		assertEquals(TokenType.OLT, fromInput("<"));
		assertEquals(TokenType.OGTEQUALS, fromInput(">="));
		assertEquals(TokenType.OLTEQUALS, fromInput("<="));
		assertEquals(TokenType.COMMA, fromInput(","));
		assertEquals(TokenType.COLON, fromInput(":"));
		assertEquals(TokenType.SEMICOLON, fromInput(";"));
		assertEquals(TokenType.PIPE, fromInput("|"));
		assertEquals(TokenType.LSMBRACKET, fromInput("("));
		assertEquals(TokenType.RSMBRACKET, fromInput(")"));
		assertEquals(TokenType.LCBRACKET, fromInput("{"));
		assertEquals(TokenType.RCBRACKET, fromInput("}"));
		assertEquals(TokenType.LSQBRACKET, fromInput("["));
		assertEquals(TokenType.RSQBRACKET, fromInput("]"));
		assertEquals(TokenType.SPACE, fromInput("    "));
		assertEquals(TokenType.DOT, fromInput("."));

		assertEquals(TokenType.NEWLINE, fromInput("\n"));
		assertEquals(TokenType.NEWLINE, fromInput("\r\n"));
		assertEquals(TokenType.NEWLINE, fromInput("\r"));
	}
	@Test
	public void checkComment() {
		assertEquals(TokenType.COMMENT, fromInput("##123456"));
		assertEquals(TokenType.COMMENT, fromInput("##"));
	}
}
