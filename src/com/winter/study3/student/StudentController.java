package com.winter.study3.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		System.out.println("student");

		// 1.학생정보입력 2.전체정보출력 3.학생검색 4.종료
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		StudentService service = new StudentService();
		StudentView studentView = new StudentView();
		Student[] students = null;

		while (flag) {
			System.out.println("1.학생정보입력 2.전체정보출력 3.학생검색 4.종료");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("학생정보입력 코드 작성해");
				students = service.makeStudent();

			} else if (select == 2) {
				System.out.println("전체정보출력 코드 작성해");
				if (students != null) {
					studentView.view(students);
				} else {
					studentView.view3("학생 정보를 먼저 입력");
				}

			} else if (select == 3) {
				System.out.println("학생검색 코드 작성해");
				Student student = service.findByNum(students);
				if (student != null) {
					studentView.view2(student);
				} else {
					studentView.view3("검색 결과가 없습니다");
				}

			} else if (select == 4) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못 입력");
			}
		}

	}

}