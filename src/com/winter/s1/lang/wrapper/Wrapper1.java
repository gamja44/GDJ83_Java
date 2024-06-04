package com.winter.s1.lang.wrapper;

public class Wrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		Integer i = new Integer("10");//쓸 수 있지만 쓰지 말자
		
		int num = 10;
		i = new Integer(null);
		int n = Integer.parseInt("10");
		
		//wrapper
		num =10;
		//auto boxing
		Integer n1 = num;
		//auto unboxing
		num = n1;
		
		Double d1 = 3.12;//더블클래스타입
		n1 = (int)3.12;
		//System.out.println(n1);
		
	}

}
