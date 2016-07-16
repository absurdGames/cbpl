package org.absurd.cbpl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public enum TokenType {
	STRING("\"(?:[^\"\\\\]|\\\\.)*\""), NUMBER(
			"\\d+(?:\\d*)?(?:e[-+]?\\d+)?"), IDENTIFIER(
					"[a-zA-Z_]\\w*"), OADD("\\+"), OSUB("\\-"), OMUL("\\*"), ODIV("\\/"), OMOD(
							"%"), OEXP("\\^"), OASSIGN("(?<!=)=(?!=)"), ONONEQUALS("!="), OEQUALS("=="), OGT(
									"\\>"), OLT("\\<"), COLON(":"), SEMICOLON(";"), COMMA(","), PIPE("\\|"), LSMBRACKET(
											"\\("), RSMBRACKET("\\)"), LCBRACKET("\\{"), RCBRACKET("\\}"), LSQBRACKET(
													"\\["), RSQBRACKET("\\]"), NEWLINE("\\n+"), SPACE("\\s+"), DOT(
															"\\."), COMMENT("\\#\\#.*"), UNKNOWN("."), EOF("");

	public static Pattern PATTERN;

	private String regex;

	private TokenType(String regex) {
		this.regex = regex;
	}

	public String getRegex() {
		return this.regex;
	}

	static {
		List<String> str = new ArrayList<String>();
		for (TokenType t : values())
			if (t != EOF)
				str.add("(?:" + t.regex + ")");
		PATTERN = Pattern.compile("(?:" + Cbpl.joinString("|", str) + ")");
	}

	public static TokenType fromInput(String string) {
		for (TokenType tokentype : values())
			if (Pattern.matches(tokentype.regex, string) && tokentype != EOF)
				return tokentype;
		return null;
	}

}
