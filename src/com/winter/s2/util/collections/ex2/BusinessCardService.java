package com.winter.s2.util.collections.ex2;

public class BusinessCardService {
	
	private StringBuffer sb;
	
	public BusinessCardService() {
		this.sb = new StringBuffer();
		sb.append("김영희, 과장, 삼성, 010-123-4567");
		sb.append("고철수, 대리, 현대, 010-234-2984");
		sb.append("박수찬, 사원, Sk, 010-393-4389");
		sb.append("이영지, 인턴, 효성, 010-908-1239");
		sb.append("김민주, 부장, 현대, 010-093-0912");	
	}
	
	//businesscardservice의 있는것을 문자열에 담아서 출력
	public void init() {
		String info = sb.toString();
		info = info.replace(" ", "");
		
		
		
	}
	
}
