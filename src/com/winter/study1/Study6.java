package com.winter.study1;

public class Study6 {
	
	public static void main(String []args) {
		
		int total = 256;
		int avg = total/3;
		
		//평균 90점이상이면 A
		//평균 80점이상이면 B
		//평균 70점이상이면 C
		//평균 60점이상이면 D
		//평균 F
		//switch case 사용
		
		switch(avg/10) {
		case 10:
		case 9: System.out.println("A");
		//int n=10;
		break;
		case 8: System.out.println("B");
		//중복선언
		//int n=10;
	
		break;
		case 7: System.out.println("C");
		break;
		case 6: System.out.println("D");
		break;
		default: System.out.println("F");
		break;
		}
		
	}
	
}
