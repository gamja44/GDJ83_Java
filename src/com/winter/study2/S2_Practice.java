package com.winter.study2;

import java.util.Scanner;

public class S2_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생 수를 입력받아서 학생 수만큼 이름과 국어점수, 영어점수, 수학점수를 입력받아서 최종 출력
		// a:80, b:90
		
		Scanner sc = new Scanner(System.in); //스캐너객체 생성해서 입력가능할수있게 만들어줌
		
		//1.학생정보 입력 2.학생정보 출력 3.학생정보 검색 4.성적순출력 5.프로그램종료
		//1에서 5번까지 반복문을 통해서 돌리자
		//반복문 while문을 이용해서 만들어보자
		//조건문은 switch문을 이욯해서 작성해보자
		//while문에 형식 while(조건식){조건식이 참일때 실행}
		System.out.println("1.학생정보 입력 2.학생정보 출력 3.학생정보 검색 4.성적순출력 5.프로그램종료");
		int select = sc.nextInt(); //스캐너에서 번호를 입력받아서 변수에 넣어주고 switch문에서 사용한다
		
		boolean flag=true;//while문 조건식을 만족하기위해서 boolean타입을 이용해서 사용
		String[] names = null;//이름을 string배열에 null로 입력
		
		while(flag) {
			switch(select) {
			case 1:
				System.out.println("1.학생정보 입력");
				int count = sc.nextInt(); //스캐너에서 학생 수를 입력받기 위한 count변수에 널자
				
				names = new String[count]; //names라는 이름의 변수에 배열의 count갯수만큼 배열을 생성해주자
				
				for (int i=0;i<count;i++) {//스캐너에서 값을 몇 받는지 알 수없기때문에 for문을 이용해서 반복문을 만들어준다
					System.out.println("학생이름");
					names[i] = sc.next(); //이름을 숫자만큼 스캐너에서 받아오자 그럼 names[]선언은 어디서 해야하는가?
					System.out.println(names[i]);
				}
				break;
			case 2:
				System.out.println("2.학생정보 출력");
				break;
			case 3:
				System.out.println("3.학생정보 검색");
				break;
			case 4:
				System.out.println("4.성적순출력");
				break;
			default:
				System.out.println("프로그램을 종료합니다."); //프로그램 종료
				break;
			
			}
			
		}
		
	}

}
