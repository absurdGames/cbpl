package org.absurd.cbpl;

public class Token {

	public TokenType type;
	public Object value;
	public int row, col;

	public Token(TokenType type, Object value, int row, int col) {
		this.type = type;
		this.value = value;
		this.row = row;
		this.col = col;
		
		if(this.type == TokenType.STRING)
			value = value.toString().subSequence(1, value.toString().length() - 1);
		else if(this.type == TokenType.NUMBER)
			value = Integer.parseInt(this.value.toString());
	}
	
	public String toString() {
		return "(" + type + ", \"" + value + "\", " + row + ", " + col + ")";
	}

}
