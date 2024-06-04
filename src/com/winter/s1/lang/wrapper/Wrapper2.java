package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비번길이는 최소 6글자 이상
		//대소문자, 숫자 1개 이상이 있어야함 isdigit();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("pw를 입력");
		String pw = sc.next();
		//pw에 대문자 1개 이상 있어야한다.
		
		String result = "최소 대문자 1개이상 있어야함";
		
		for(int i=0;i<pw.length();i++) {
		Character ch = pw.charAt(i);
			if(Character.isUpperCase(ch)) {
				result = "통과";
				break;
			}
				System.out.println(result);
		}
	}

}
