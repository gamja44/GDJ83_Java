package com.winter.study3.student;

import java.util.Scanner;

public class StudentService {
	//studentservice에 메소드 만들거야
	public void  makeStudent() {
		//같은 데이터타입을 묶는 것 ->배열
		//학생들을 모을 배열을 리턴 
		//키보드로 숫자를 받아서 배열에 넣어보자
		Scanner sc = new Scanner(System.in);//숫자를 받을 키보드 연결
		//int타입의 ar[i] 받을거야
		int count= sc.nextInt();//키보드에서 숫자 하나만 받아서 먼저 i의 값을 받자
		Student[] students = new Student[count]; //학생클래스에서 학생 객체를 생성하자
		//학생클래스를 만드는데 배열로 받자
		//새로운 객체가 배열처럼 생성
		//객체 생성 변수i만큼 만들어야하기때문에 for문을 사용하자
		for(int i=0;i<students.length;i++) {
			//i만큼 객체가 생성이 되는데 이것을 어떻게 집어넣어야하는가?
			//Students[i]=new Student();
			student s =new Student();
			
		}
		
	}
	
	
}
