package org.absurd.cbpl.codeblock;

import java.util.List;
import java.util.ArrayList;
import org.absurd.cbpl.token.*;

public class Line {
	int line_num;
	int indent;
	List<Token> tokens;
	public Line(int line_num) {
		this.line_num = line_num;
		tokens = new ArrayList<>();
	}
	public void addToken(Token token) {
		if (tokens.size() == 0) {
			indent = token.col;
		}
		tokens.add(token);
	}
	public String toString() {
		return String.format("line %d, indent: %d, tokens: %s", line_num, indent, tokens.toString());
	}
}
