package com.winter.study3;

import java.util.Random;

public class StudyReturn {
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
