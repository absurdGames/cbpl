package org.absurd.cbpl;

public class CbplException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public int row, col;
	
	public CbplException(String message, int row, int col) {
		super(message);
		this.row = row;
		this.col = col;
	}
	
}
