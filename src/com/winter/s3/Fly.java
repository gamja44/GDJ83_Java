package com.winter.s3;

public interface Fly extends Landing {
	
	//상수 접근지정자는 무조건 public만 가능, final도 사용
	public final static int NUM = 1;
	String name = "abc";//기울어져있으면 static
	
	
	//추상 메서드
	//접근지정자는 무조건public 그외지정자 abstract
//	public abstract void t1();
//	public int t2();
//	abstract String t3(int num);
//	void t4();
//	
	
	public abstract void flyAble();//선언부
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
