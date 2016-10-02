package org.absurd.cbpl;

import org.fusesource.jansi.Ansi;

public class CompileResult {

	public static final String IMPULSE, REPEAT, CHAIN;

	public String type;
	public String cmd;

	public CompileResult(String type, String cmd) {
		assert type.equals(IMPULSE) || type.equals(CHAIN) || type.equals(REPEAT);
		this.type = type;
		this.cmd = cmd;
	}
	
	public String toString() {
		return type + Ansi.ansi().fgBrightRed().a(cmd);
	}
	
	static {
		String suffix = Ansi.ansi().fgDefault().a(": ").toString();
		IMPULSE = Ansi.ansi().fgYellow().a("i" + suffix).toString();
		REPEAT = Ansi.ansi().fgMagenta().a("r" + suffix).toString();
		CHAIN = Ansi.ansi().fgBrightBlue().a("c" + suffix).toString();
	}

}
