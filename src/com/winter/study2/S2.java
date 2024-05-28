package com.winter.study2;

public class S2 {
	public static void main(String[] args) {
		// 배열 - 하나의 변수로 여러개의 데이터를 다룰때 사용
		// let ar = [1,2,3]
		// ar.push(값집어넣기)
		// 같은 데이터타입만 모을 수 있다.
		// 자바는 몇 개를 넣을 지 선언해야한다.
		// 모을려고하는 데이터 타입명 [] 변수명 = new 모을려고하는 데이터타입명 [갯수]
		int[] ar = new int[3];
		int[] ar2 = { 1, 2, 3 };
		System.out.println(ar);

		System.out.println(ar[0]); // 힙영역에 생기는 것은 기본값이 타입에 맞게 초기화가 자동으로 된다.
		// 인스턴스 변수 - 초기화가 자동으로 된다.
		ar[0] = 50;
		ar = ar2;
		System.out.println(ar[0]);

	}

}
