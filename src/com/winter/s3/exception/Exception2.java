package com.winter.s3.exception;

public class Exception2 {
	
	public void hap(int n1, int n2)throws Exception {
		//유치원생이 3자리수 이상은??
		//59까지는 읽을 수 있다함 
		//강제 예외처리 만들기
		int h = n1 + n2;
		
		if(h>99) {
			throw new MyException();
		}
	}
	
	
}
