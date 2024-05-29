package com.winter.study2;

import java.util.Scanner;

public class S2_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//배열 집어넣고 꺼내쓰기 다시 입력하기
	Scanner sc = new Scanner(System.in);
	int[] ar = new int[5];
	//길이의 값만큼 배열 안에 값을 넣자
	System.out.println("인덱스의 값에 넣을 숫자를 입력해주세요");
	for(int i=0;i<ar.length;i++) {
		ar[i]=sc.nextInt(); //ar[i]의 배열의 for문이 끝나기 전에 리턴값으로 돌려준다
		System.out.println(i + "번째 값입력");
	}		
	for (int i = 0; i < ar.length; i++) {
		System.out.println(ar[i]);
	}
	}

}
