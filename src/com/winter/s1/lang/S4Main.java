package com.winter.s1.lang;

import java.util.Scanner;

public class S4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = "computer Science";
		
		
		String result = name.substring(3);
		//puter Science
		
		result = name.substring(3,5);//사이에 있는 문자열 드러내라 pu
		
		System.out.println(result);
		System.out.println("파일명을 입력하세요 확장자 포함");
		name = sc.next();
		//확장자 분리
		//.jpg, png, gif, jpeg, jiff 
		//파일명이 위에 하나면 이미지파일 찾기
		//배열 만들기
		String[] img = {".jpg",".png",".gif",".jpeg",".jiff "};
		
		int result2 = name.lastIndexOf(".");
		String result3 = name.substring(result2);
		System.out.println(result3);
		
		for(int i=0;i<img.length;i++) {
			boolean result4 = result3.equals(img[i]);
			if(result4 == true) {
				System.out.println("이미지파일이 맞습니다.");
				break;
			}else {
				System.out.println("이미지파일이 아닙니다.");
		}
	}//배열이라서 계속 돌리기때문에 원하는 값만 나오지는 않았다
	 //if문 혹은 스위치문으로 사용한다.
		
	}

}
