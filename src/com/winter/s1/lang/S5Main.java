package com.winter.s1.lang;

public class S5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "    win    ter    ";
		System.out.println(name.length());
		
		name = name.strip();//앞뒤공백제거, 문자열 안에 공백을 제거하지않는다.
		System.out.println(name);
		System.out.println(name.length());
		
		name = name.replace(" ", "");
		System.out.println(name);
		System.out.println(name.length());
		
		name = "winter-24*서울";
		name = name.replace("*", "-");
		String[] datas = name.split("");
		
		for(int i=0;i<datas.length;i++) {
			System.out.println(datas[i]);
		}
		
		String a = String.valueOf(10.2);
		System.out.println(a);
		
	}

}
