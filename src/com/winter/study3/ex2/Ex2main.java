package com.winter.study3.ex2;

public class Ex2main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Study study = new Study();
		int[] ar = {1,2,3,4,5,6};
		
		ar = study.add(ar);  //매개변수로 보내는 값 -> 인자값
		System.out.println(ar.length);
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
	}

}
