package com.winter.study2;

import java.util.Scanner;

public class S2_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 학생 수를 입력받아서 학생 수만큼 이름과 국어점수, 영어점수, 수학점수를 입력받아서 최종 출력
		// a:80, b:90
		// 학생이름에 자동 번호 출력
		Scanner sc = new Scanner(System.in);// 스캐너로 입력받기

		// 1번 누르면 학생정보 입력 2.학생정보입력 3.프로그램 종료
		boolean flag = true;
		int[] nums = null;
		String[] names = null; // names에 갯수만큼 저장
		int[] ko = null;
		int[] en = null;
		int[] ma = null;
		int[] totals = null;
		double[] avgs = null;

		while (flag) {
			System.out.println("1.학생정보입력 2.학생정보출력 3.학생정보검색 4.성적순으로 출력 5.프로그램 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("학생 수 입력");
				int count = sc.nextInt(); // count에 갯수만큼 보내기

				nums = new int[count];
				names = new String[count]; // names에 갯수만큼 저장
				ko = new int[count];
				en = new int[count];
				ma = new int[count];
				totals = new int[count];
				avgs = new double[count];

				// nextline 자바에 문제가 있다, 줄이 넘어간다.

				for (int i = 0; i < names.length; i++) {
					nums[i] = i + 1;
					System.out.println("학생 이름 입력");
					names[i] = sc.next();
					System.out.println(names[i] + "의 국어점수 입력");
					ko[i] = sc.nextInt();
					System.out.println(names[i] + "의 영어점수 입력");
					en[i] = sc.nextInt();
					System.out.println(names[i] + "의 수학점수 입력");
					ma[i] = sc.nextInt();
					totals[i] = ko[i] + en[i] + ma[i];
					avgs[i] = totals[i] / 3.0;
				}
				break;
			case 2:
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				for (int i = 0; i < names.length; i++) {
					System.out.println(nums[i] + "\t");
					System.out.println(names[i] + "\t");
					System.out.println(ko[i] + "\t");
					System.out.println(en[i] + "\t");
					System.out.println(ma[i] + "\t");
					System.out.println(totals[i] + "\t");
					System.out.println(avgs[i] + "\n");

				}
				break;
			case 3:
				System.out.println("검색할 학생 번호 입력");
				int n = sc.nextInt();

				for (int i = 0; i < nums.length; i++) {
					if (n == nums[i]) {
						System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
						System.out.println(nums[i] + "\t");
						System.out.println(names[i] + "\t");
						System.out.println(ko[i] + "\t");
						System.out.println(en[i] + "\t");
						System.out.println(ma[i] + "\n");
						System.out.println(totals[i] + "\t");
						System.out.println(avgs[i] + "\n");
					}

				}

				break;
			case 4:
				for (int i = 0; i < avgs.length - 1; i++) {
					for (int j = i + 1; j < args.length; i++) {
						if (avgs[i] < avgs[j]) {
							// 둘이 자리 바꿈
							nums[i] = nums[j];
						}
					}
				}
				System.out.println("성적 출력");
				break;
			default:
				flag = !false;
			}
		}
	}
}

//		System.out.println("학생 수 입력");
//		int count = sc.nextInt(); // count에 갯수만큼 보내기
//
//		int[] nums = new int[count];
//		String[] names = new String[count]; // names에 갯수만큼 저장
//		int[] ko = new int[count];
//		int[] en = new int[count];
//		int[] ma = new int[count];
//		int[] totals = new int[count];
//		double[] avgs = new double[count];
//
//		// nextline 자바에 문제가 있다, 줄이 넘어간다.
//
//		for (int i = 0; i < names.length; i++) {
//			nums[i] = i + 1;
//			System.out.println("학생 이름 입력");
//			names[i] = sc.next();
//			System.out.println(names[i] + "의 국어점수 입력");
//			ko[i] = sc.nextInt();
//			System.out.println(names[i] + "의 영어점수 입력");
//			en[i] = sc.nextInt();
//			System.out.println(names[i] + "의 수학점수 입력");
//			ma[i] = sc.nextInt();
//			totals[i] = ko[i] + en[i] + ma[i];
//			avgs[i] = totals[i] / 3.0;
//
//			System.out.println(totals + "총점입력");
//		}
//
//		System.out.println("이름\t국어\t영어\t수학");
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(nums[i] + "\t");
//			System.out.println(names[i] + "\t");
//			System.out.println(ko[i] + "\t");
//			System.out.println(en[i] + "\t");
//			System.out.println(ma[i] + "\n");
//		}
//}
