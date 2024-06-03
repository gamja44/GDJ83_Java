package com.alone.java2;

import java.util.Scanner;

public class Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//혼자공부하는자바 2단원 1문제
		//이름: 김자바
		//나이: 25
		//전화: 010-123-4567
		String name = "김자바";
		int age =25;
		String tel1="010", tel2="123", tel3="4567";
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("전화: " + tel1 +"-"+ tel2 +"-"+ tel3);
		
		//2단원 2문제
		//스캐너를 이용하여 키보드로 입력한 두 수의 덧셈하여 결과를 출력
		Scanner scanner =new Scanner(System.in);
		
		 System.out.println("첫 번째 수:");
		 String strNum1 = scanner.next();
		 
		 System.out.println("두 번째 수:");
		 String strNum2 = scanner.next();
		 
		 int num1 = Integer.parseInt(strNum1);
		 int num2 = Integer.parseInt(strNum2);
		 int result = num1 + num2;
		 System.out.println("덧셈결과: " + result);
		 
		 //2단원 3문제
		 //스캐너를 이용하여 이름, 주민번호 앞6자리, 전화번호를 키보드에서 입력받고 출력하는 코드
		 System.out.println("[필수 정보 입력]");
		 String name2 = scanner.next();
		 System.out.println("1.이름: "+ name2);
		 String ssn = scanner.next();
		 System.out.println("주민번호 앞6자리 :" + ssn);
		 String num = scanner.next();
		 System.out.println("전화번호 :" + num);
		 
	}
}
