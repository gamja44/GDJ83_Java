package com.winter.s5;

import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		
		Calendar birth = Calendar.getInstance();
		//내생일만들어보기
		birth.set(1992, 10, 7);
		System.out.println(birth.getTime());
		
		long c = ca.getTimeInMillis();
		System.out.println(c);
		
		System.out.println(1000 * 60 * 60 * 24 * 2/1000 * 60 * 60 * 24);
		System.out.println(c/(1000*60*60*24));
		
		long a = birth.getTimeInMillis();
		System.out.println(a);
		
		System.out.println(a/(1000 * 60 * 60 * 24));
		
		long b = birth.getTimeInMillis();
		b = b+ 1000*60*60*24*100L;
		
		birth.setTimeInMillis(b);
		System.out.println(birth.getTime());
		
		
	}

}
