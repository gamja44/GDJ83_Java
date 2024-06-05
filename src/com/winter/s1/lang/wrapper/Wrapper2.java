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
		
		int upper=0;
		int lower=0;
		int digit=0;
		for(int i=0;i<pw.length();i++) {
		Character ch = pw.charAt(i);
			if(Character.isUpperCase(ch)) {
				upper++;
			}else if (Character.isLowerCase(ch)) {
				lower++;
			}else if(Character.isDigit(ch)) {
				digit++;
			}else {
				
			}
		}
		if(upper>0&&lower>0&&digit>0) {
			System.out.println("통과");			
		}else {
			System.out.println("fail");			
		}
			
	}

}
