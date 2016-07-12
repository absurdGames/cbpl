package org.midnightas.cbpl;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.Ansi.Color;

public class CompiledString {

	public static final String IMPULSE = Ansi.ansi().fg(Color.YELLOW).bold().a('i').reset().toString();
	public static final String CHAIN = Ansi.ansi().fg(Color.CYAN).bold().a('c').reset().toString();
	public static final String REPEAT = Ansi.ansi().fg(Color.MAGENTA).bold().a('r').reset().toString();
	
	public String type;
	public String result;

	public CompiledString(String type, String result) {
		this.type = type;
		this.result = result;
	}

}
