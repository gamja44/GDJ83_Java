package com.winter.study1;

import java.util.Scanner;

public class Study9 {
	public static void main(String [] args) {
		//개인 연습 문제
		//로그인 검증 문제
		//id=1234, pw=5678
		//로그인 시도 전에 1.로그인 2.종료
		//사용자의 id와 pw를 입력 받아서 로그인 시도를 n번 시도
		//틀리면 로그인 실패 출력, 로그인 성공하면 성공을 출력하고 반복문 종료
		
		//반복문 종료 후 종료를 선택 했다면 프로그램이 종료
		//로그인이 성공 후 반복문이 종료되었다면 게임을 시작하자
		
		//MMORPG : 
		//시작 레벨은 1로 시작해서 15가 만렙
		//골드 : 0으로 시작
		//1 -> 2 :3마리
		//2 -> 3 :6마리
		//3 -> 4 :9마리
		//14 -> 15 :42마리
		//5레벨 달성시 1000G 지급
		//10레벨 달성시 2000G 지급
		//15레벨 달성시 3000G 지급
		//현재 레벨 현재 Gold 출력하고 종료
		
		Scanner sc = new Scanner(System.in);     //키보드 입력 연결하는 코드,한 번만 사용 가능
		//int id = 1234;
		//int pw = 5678;
		boolean flag = true;                     //while문에 들어가는 조건식 true, false, 시작하기 위한 용도
		
		while(flag) {
			System.out.println("1.로그인 2.종료");       //로그인 시도 전에 1번과 2번 받기
			int select = sc.nextInt();               //받은 번호를 변수select에 받기
			if(select ==1) {                         //select 1번
      			System.out.println("id를 입력");       //id 입력받기
				int id =sc.nextInt();
				System.out.println("pw를 입력");       //pw 입력받기 
				int pw = sc.nextInt();
				if(id==1234 && pw==5678) {           //id와pw 동일한 경우 앤드연산자 사용
					System.out.println("로그인 성공");
					break;                           //break문을 이용하여 멈춤, flag=false;사용도 가능
				}else {
					System.out.println("로그인 실패");
				}
			}else {
				System.out.println("종료");            //로그인 종료   
				flag=false;
			}
		}
		//---------------------------------------로그인 검증 끝------------------------------------------------------------
		
		//로그인 성공 시 게임시작
//		System.out.println("게임시작");     
//			//레벨은 레벨15까지 최대치 ->반복횟수가 정해져 있음 for문
//			int i=1;
//			for(i=1;i<=15;i++){                 //레벨이 0부터 시작 마지막 레벨 15
//				int j=3*i;
//				System.out.println("현재레벨 : "+i);
//				System.out.println(j+ "몬스터를 잡았습니다.");
//				if(flag) {
//			
//				if(i%5==0) {
//					System.out.println("레벨"+i+"달성"+1000*i+ "지급"); //레벨 달성시 골드출력하고 종료
//				}
//			}
//			System.out.println("최종 레벨 : " +i);
//		}
//		System.out.println("프로그램이 종료됩니다.");
		//---------------------------------------------------------------------------------------------------------------
		if(flag) {
			System.out.println("게임시작");     
			//레벨은 레벨15까지 최대치 ->반복횟수가 정해져 있음 for문
			System.out.println("1.사냥 2.종료");       //로그인 시도 전에 1번과 2번 받기
			int select = sc.nextInt();
			if(select != 1) {
				break;
			}
			}
			int i=1;
			int mon=3;
			int gold =0;
			for(i=1;i<=15;i++){ //레벨이 0부터 시작 마지막 레벨 15
				if(i%5==0) {
				gold=gold + i/5*1000;
				System.out.println(i+"축하금"+i/5*1000+"지급");
				}
				System.out.println("현재레벨 : "+i);
				for(int j=0;j<i*mon;j++) {
					System.out.println(j+1+"번째 사냥");
				}
			
			}
			
			System.out.println("최종 레벨 : " +i);
		}
		System.out.println("프로그램이 종료됩니다.");
		
		
		
		
		
		
		
	
		
		
		
		
		
	}}
