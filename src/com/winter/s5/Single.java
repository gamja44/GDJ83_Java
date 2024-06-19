package com.winter.s5;

public class Single {
	
	private static Single single;
	
	private int num =10;
	
	private Single() {
		
	}
	
	public static Single get() {
		if(single == null) {
			Single.single = new Single();
		}
		return new Single();
	}
}
