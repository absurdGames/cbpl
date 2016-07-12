package org.midnightas.cbpl;

public class CbplException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public int tokenLocation;
	
	public CbplException(int tokenLocation, String cause) {
		super(cause);
		this.tokenLocation = tokenLocation;
	}
	
}
