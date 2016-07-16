package org.absurd.cbpl.token;

import java.util.Stack;
import java.util.regex.Matcher;
import static org.absurd.cbpl.util.StringUtil.*;
import org.absurd.cbpl.CbplException;
import org.absurd.cbpl.codeblock.Line;

public class Token {

	public TokenType type;
	public Object value;
	public int col;

	public Token(TokenType type, Object value, int col) {
		this.type = type;
		this.value = value;
		this.col = col;
		
		if(this.type == TokenType.STRING)
			value =  unescape(value.toString().substring(1, value.toString().length()-1));
		else if(this.type == TokenType.NUMBER)
			value = Integer.parseInt(this.value.toString());
	}
	
	public String toString() {
		return String.format("(%s, \"%s\", %d)", type, escape(value.toString()), col);
	}
	
	public static Line[] tokenize(String content) throws CbplException {
		Stack<Line> lines = new Stack<Line>();
		lines.add(new Line(1));
		Matcher m = TokenType.PATTERN.matcher(content);
		int row, col;
		row = 1;
		col = 0;
		while (m.find()) {
			String group = m.group();
			TokenType type = TokenType.fromInput(group);
			switch (type) {
				case UNKNOWN:
					throw new CbplException("Unknown token " + group, row, col);
				case COMMENT:
					lines.pop();
					col += group.length();
					break;
				case SPACE:
					col += group.length();
					break;
				case NEWLINE:
					col = 0;
					row++;
					lines.add(new Line(row));
					break;
				default:
					lines.peek().addToken(new Token(type, group, col));
					col += group.length();
					break;
			}
		}
		//tokens.add(new Token(TokenType.EOF, 0, col));
		return lines.toArray(new Line[lines.size()]);
	}
}
