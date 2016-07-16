package org.absurd.cbpl;

import org.absurd.cbpl.token.Token;
import org.absurd.cbpl.codeblock.Line;

public class Cbpl {
	
	public static final void main(String[] args) {
		try {
			new Cbpl("x = 5 + 5\r\n" + 
		        " y=20\n"+
				"##\n" + 
		        "function(a,b,c)").run();
		} catch (CbplException e) {
			System.err.println("Error: " + e.getMessage());
			System.err.println("Row " + e.row + ", Col " + e.col);
		}
	}
	
	public String content;
	public Line[] lines;
	
	public Cbpl(String content) throws CbplException {
		this.content = content;
		this.lines = Token.tokenize(this.content);
	}
	
	public void run() {
		for (Line line : lines) {
			System.out.println(line.toString());
		}
	}
}
