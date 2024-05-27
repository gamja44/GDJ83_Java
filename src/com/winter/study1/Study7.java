package com.winter.study1;

import java.util.Scanner;

public class Study7 {
	public static void main(String []args) {
		
		//반복문-for,while
		//for(초기식;조건식;증감식){}
		//while(조건식){}
		//do{}while(조건식);
		//break, continue
		//3과목의 점수를 입력 받아서 합계 구하기
		Scanner sc = new Scanner(System.in);
		
		//입력받아서 합계를 내자
		int sum=0;
		for(int i=0;i<3;i++){
			int num = sc.nextInt();
			//sum=sum+num; 아래식과 같은 식
			sum+=num;
		}	
		//'a' -> z출력
		int c=97;
		for(int i=0;i<25;i++) {
			System.out.println((char)c);
			c++;
		}
		//2번째 방법
		//char c='a';
		for(char i='a';i<'z';i++) {
			System.out.println((char)i);
			c++;
		}
		
		
		
		   	//System.out.println(i);
			System.out.print("abc");
			System.out.println("");
			System.out.println("def");
			
		
	}
}
