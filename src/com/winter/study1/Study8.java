package com.winter.study1;

import java.util.Scanner;

public class Study8 {
	public static void main(String []args) {
		//중첨for문
		//FPS 배그,서든,배필
		//총알(30발, 탄창3개)
		//점사, 단발
		//1.단발모드 탕소리 30번 다 사용 후 단발? 점사? 물음표
		//2.점사모드 탕소리 10번 다 사용 후 단발? 점사? 물음표
		Scanner sc = new Scanner(System.in);
		int tan = 3;
		
		for(int i=0;i<tan;i++) {
			System.out.println("1.단발 2.점사");
			int select =sc.nextInt();
			System.out.println(select);
			if(select==1) {
				for(int j=0;j<30;j++) {
				System.out.println(j+1+"번탕 ");
				}
			}else {
				for(int j=0;j<10;j++) {
				System.out.println(j+1+"번탕 ");
				}
			}
			
		}
		
		
//		int s = sc.nextInt();
//		
//		for(s=0;s<3;s++) {
//		if(s==3) {
//			for(int i=0;i<30;i++) {
//				System.out.println("탕");
//			}
//			}else {
//				for(int j=0;j<30;j++) {
//					System.out.println("타다당");
//				}		
//			
//			}
//		}
	}
}
