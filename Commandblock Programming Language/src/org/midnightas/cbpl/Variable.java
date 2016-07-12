package org.midnightas.cbpl;

public class Variable {
	
	private static int ids = 0;
	
	public final int id;
	
	public Object content;
	public boolean isFinal = false;
	public String name;
	
	public Variable(Object content, String name) {
		this(content, name, false);
	}
	
	public Variable(Object content, String name, boolean isFinal) {
		this.id = ids++;
		this.content = content;
		this.name = name;
		this.isFinal = isFinal;
	}
	
	public String toString() {
		return "(\"" + content + "\"," + isFinal + ")";
	}
	
}
