package com.winter.study3.student;

import java.util.Scanner;

public class StudentController {
	
	public void start() {
		System.out.println("student");
		
		//1. 학생 정보 입력 2.전체 정보 출력 3.학생 검색 4. 종료
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		StudentService make = new StudentService();
		
		while(flag) {
			System.out.println("1. 학생 정보 입력 2.전체 정보 출력 3.학생 검색 4. 종료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("학생 정보 입력");
				
			Student[] students = make.makeStudent();
			
			for(int i=0;i<students.length;i++) {
				
				System.out.println(students[i].name);
			}
				
			}else if(select==2) {
				System.out.println("전체 정보 출력");
				
			}else if(select==3) {
				System.out.println("학생 검색");
			}else if(select==4){
				System.out.println("종료");
				break;
			}else {
				System.out.println("잘못 입력");

			}
		}
		
	}

}
