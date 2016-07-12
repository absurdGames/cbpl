package org.midnightas.cbpl;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.Ansi.Color;

public class Token {
	
	public static final int TOKEN_KEY = 0;
	public static final int TOKEN_STRING = 1;
	
	public int type;
	public String key;
	
	public Token(int type, String key) {
		this.type = type;
		this.key = key;
	}
	
	public String toString() {
		return "(" + Ansi.ansi().fg(type == TOKEN_KEY ? Color.RED : Color.GREEN).a(type).reset() + ", \"" + key + "\")";
	}
	
}
