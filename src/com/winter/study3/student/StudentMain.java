package com.winter.study3.student;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();//학생 설계도보고 학생객체를 생성
		s.info();//학생 객체의 메소드
		s.name = "영희";
		System.out.println(s.name);
	}

}
