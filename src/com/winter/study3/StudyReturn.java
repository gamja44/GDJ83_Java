package com.winter.study3;

import java.util.Random;

public class StudyReturn {
	//매개변수 int n, int n2,String name ,로 구분한다. 순서대로 맞춰서 사용해야한다 갯수,타입 전부 다 가능
	public Test t5(Test t) {
		System.out.println(t.level);
		t.level =200;
		t = new Test();
		t.level = 500;
		
		return t;
	}
	
	
	
	//매개변수 선언
	//월급을 받아서 세금계산 3.3프로 제외한 실수령액 계산
	public void t4(int sal) {
		//실수령액 = 월급 - 월급*0.033
		double result = sal-sal*0.033;
		System.out.println(result);
		
		sal=100;
		
		
	}
	
	
	
	
	
	
	
	
	 //접근지정자 [그외지정자] 리턴타입 메서드명 ([매개변수선언]){}
	public int t1(){
		//리턴타입의 제한은 없음
		int num=3;
		int num2=6;
		int result=num*num2;
		
		//보이드는 리턴이 없다.
		//리턴의 데이터갯수는 딱 하나만 가능 어떡하던 리턴타입은 하나만 만든다.
		return result; //리턴이 없을 때 보이드 사용
		
	}
	public void t2() {
		Random random = new Random();
		//0이상 10미만의 정수 하나를 랜덤하게 리턴
		int num = random.nextInt(10);
		if(num%2==0) {
			return; //리턴할 값이 없으면 사용할 수 있다. 그리고 보이드가 있는데 리턴만 있다면 그 즉시 종료하겠다
		}else {
			System.out.println(num);
		}
		
		
		
	}
	
}
