package com.winter.study2;

import java.util.Scanner;

public class S2_class {

	public static void main(String[] args) {

		int[] ar = new int[5];
		// 각 인덱스 번호 칸에 값을 키보드로 입력받아서 저장하기
		Scanner sc = new Scanner(System.in); // 주소를 담아라

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i);
			ar[i] = sc.nextInt();
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("배열의 크기를 입력");

		int l = sc.nextInt();
		int[] nums = new int[1]; // 상수값을 보고 데이터타입을 알수있어야한다.

	}

}
