package com.winter.s1.lang;

import java.util.Scanner;

public class S2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Object obj1 = new Object();
		Object obj2 = new Object();
		boolean flag = obj1.equals(obj2);
		System.out.println(flag);
			
		Test t1= new Test();
		Test t2= new Test();
		System.out.println(t1==t2);
		t1.age = 9;
		flag = t2.equals(t1);
		System.out.println(flag);
		System.out.println(t1.equals(t2));
		
		String name="winter";
		System.out.println("이름입력");
		String name2 = sc.next();
		String name3 = "winter";
		System.out.println(name == name3);
		System.out.println(name.equals(name2));
		name3 = name3 + name2;
		System.out.println(name3 + name2);
		
		
	}

}
