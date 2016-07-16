package org.absurd.cbpl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Cbpl {
	
	public static final void main(String[] args) {
		try {
			new Cbpl("x = 5 + 5;").run();
		} catch (CbplException e) {
			System.err.println("Error: " + e.getMessage());
			System.err.println("Row " + e.row + ", Col " + e.col);
		}
	}
	
	public String content;
	public List<Token> tokens;
	
	public Cbpl(String content) throws CbplException {
		this.content = content;
		this.tokens = tokenize(this.content);
	}
	
	public void run() {
		
	}

	public static List<Token> tokenize(String content) throws CbplException {
		List<Token> tokens = new ArrayList<Token>();
		Matcher m = TokenType.PATTERN.matcher(content);
		int row, col;
		row = col = 1;
		while (m.find()) {
			String group = m.group();
			TokenType type = TokenType.fromInput(group);
			if (type == TokenType.UNKNOWN)
				throw new CbplException("Unknown token " + group, row, col);
			else if (type == TokenType.SPACE || type == TokenType.COMMENT)
				col += group.length();
			else if (type == TokenType.NEWLINE) {
				col = 1;
				row++;
			} else {
				tokens.add(new Token(type, group, row, col));
				col += group.length();
			}
		}
		tokens.add(new Token(TokenType.EOF, 0, row, col));
		System.out.println(tokens);
		return tokens;
	}

	public static <T> String joinString(String delimiter, List<T> objs) {
		String output = "";
		for (int i = 0; i < objs.size(); i++) {
			output = output + delimiter + objs.get(i);
		}
		output = output.substring(1);
		return output;
	}
	
}
