package com.winter.s1.lang;

import java.util.Scanner;

public class S1Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		Object obj = new Object();
		Object obj2 = new Object();
		String n = new String("winter");
		String n2 = "winter";
		
		System.out.println(obj);
		System.out.println(n.toString());
		System.out.println(obj == obj2);
		System.out.println(n.equals(n2));
		
		
		char ch = n.charAt(1); //멤버메서드 참조변수명.멤버들
			        		//참조변수 주소를 담고있는 변수
		System.out.println(ch);
		
		System.out.println("문자열 입력");
		n = sc.next();
		
		for(int i=0;i<n.length();i++) {
			ch= n.charAt(i);
			System.out.println(ch);
			
		}
		
		System.out.println(n.length()*1000+"원입니다");
		
		
		
		
		
		
		
		
		
		
	}

}
