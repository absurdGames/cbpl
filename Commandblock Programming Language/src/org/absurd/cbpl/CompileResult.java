package org.absurd.cbpl;

import org.fusesource.jansi.Ansi;

public class CompileResult {

	private static Ansi ansi = Ansi.ansi();

	public static final String IMPULSE, REPEAT, CHAIN;

	public String type;
	public String cmd;

	public CompileResult(String type, String cmd) {
		assert type.equals(IMPULSE) || type.equals(CHAIN) || type.equals(REPEAT);
		this.type = type;
		this.cmd = cmd;
	}

	static {
		String suffix = ansi.fgDefault().a(": ").toString();
		IMPULSE = ansi.fgYellow().a("i" + suffix).toString();
		REPEAT = ansi.fgMagenta().a("r" + suffix).toString();
		CHAIN = ansi.fgBrightBlue().a("c" + suffix).toString();
	}

}
