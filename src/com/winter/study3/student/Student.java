package com.winter.study3.student;

public class Student {
	//학생이라는 하나의 설계도를 작성해보자
	//학생의 특성과 행동을 입력한다
	int num;
	String name;
	int kor;
	int eng;
	int math;
	int total; //점수 총 합계
	double avg;
	
	//변수 선언 공식 데이터타입명 변수명 ;
	//객체 생성 공식 new 클래스명();클래스 설계도를 보고 new라는 새로운객체가 생성의 탄생
	//메서드 선언 공식
	//public static void main(String [] args){}
	//접근지정자[그외지정자]리턴타입 메서드명[(매개변수선언)]{}
	//학생의 메서드
	public void info() {//학생의 메소드 즉,학생의 정보메소드(함수는 아니지만 비슷)
		int num = 10;
		System.out.println("info실행");
	}
}
