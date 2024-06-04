package com.winter.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		//991225-1234567
		String jumin = sc.next();
		//1.성별을 검증 뒷번호가 1이면 남자 2이면 여자 3이면 남자 4면 여자 5이상 외국인
		Character num = jumin.charAt(7);
		//jumin.subString(7,8); ->string타입으로 반환
		if(num == '1'|| num == '3') {
			System.out.println("남자");
		}else if(num == '2' || num == '4' ) {
			System.out.println("여자");
		}else {
			System.out.println("외국인");
		}
		//2.나이를 계산 2024- 출생년도
		String age = jumin.substring(0, 2);
		
		int r =1900;
		if(num == '3'||num == '4') {
			r=2000;
		}
		int year = 1900 + Integer.parseInt(age);
		System.out.println(2024 - year);
		
		//3.주민번호 유효성 검증
		//9 5 1  2  2  6 - 1  2  3  4   5  6 7(검증용 숫자)
		//*2 *3 *4 *5 *6   *7 *8 *9 *2 *3 *4  다 더해서 대충 122
		//총합을 11로 나눈 나머지를 구하기
		//122%11 -- 1
		//나머지 11로 뺀 결과값을 검증용 숫자와 같은지 비교
		//11-1 => 10 
		//뺀 결과 값이 2자리수라면 뺀 결과값을 10으로 나눈 나머지를 검증용 숫자랑 비교
		//10%10=0 이것을 검증용 숫자ㅣ비교
		//String num1 = jumin.substring(0, 6)+ jumin.substring(7, 13);
		//String[] n = num1.split("");
			
		//2번째 계산방법 String n2 = String.valueOf(n1);	
		//char n1 = jumin.charAt(0);
		//int num1 = Integer.parseInt(n1 + "");	
		//System.out.println(num1*2);
		String ju = jumin.toString();
		String ju1 = ju.replace("-", "");
		String[] ju2 = ju1.split("");
		
		for(int i=0;i<9;i++) {
			int result = Integer.parseInt(ju2[i]);
			int result1 = result*i;
			System.out.println(result1);
	
			}
		
		
		
//		for(int i=0;i<6;i++) {
//			//if문,증감식
//			char n1 = jumin.charAt(i);
//			int num1 = Integer.parseInt( n1 + "");
//			int result = num1*(i+2);
//			sum += result;
//			System.out.println(sum);
			
//		}
	}
}
