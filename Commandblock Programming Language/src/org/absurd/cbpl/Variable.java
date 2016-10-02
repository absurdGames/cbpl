package org.absurd.cbpl;

public class Variable {
	
	public boolean isAlreadyJSON = false;
	public Object value;
	
	public Variable(Object value) {
		this(value, false);
	}
	
	public Variable(Object value, boolean isAlreadyJSON) {
		this.value = value;
		this.isAlreadyJSON = isAlreadyJSON;
	}
	
}
