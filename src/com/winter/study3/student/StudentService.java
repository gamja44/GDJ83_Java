package com.winter.study3.student;

import java.util.Scanner;

public class StudentService {

	public Student[] makeStudent() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 수를 입력하세요");
		//학생 수 만큼 정수배열을 만들어서 리턴을 하세요
		//리턴값이 정수배열이 와야하기때문에 int타입으로 선언하기
		
		
		int count =sc.nextInt();
		//학생들을 모을 배열을 리턴
		//학생
		//배열
		Student[] students =new Student[count];//학생이라는 클래스가 만들어져있는 상태이고 이 학생을 만들어서 리턴을 한다.
		                                       //학생이라는 객체를 생성한 후 생성한 객체의 스캐너로 받은 값을 넣어준다
		for(int i=0;i<students.length;i++) {
			
			
			students[i] = new Student();  //클래스는 객체부터 만들어야 한다. i에 숫자가 올라갈때마다 객체가 생성한다.
			                              //리턴값을 하나 만들기위해서 배열을 나눠서 객체를 하나씩 생성한다.
		}
		
		
		return students;
		
//		int[] ar = new int[count];
//		
//		//학생 한 명을 사용해서 리턴하자
//		Student st = new Student();
		
		//return ar;
	}
}
	
