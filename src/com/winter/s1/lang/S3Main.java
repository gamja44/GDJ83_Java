package com.winter.s1.lang;

import java.util.Scanner;

public class S3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//f인덱스 입력해서 찾아라
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		boolean flag = true;
		int result = 0;
		
		//int result = name.indexOf('z');
		 while(flag) {
			 
				result = name.indexOf("f",result);
				if(result == -1) {
					break;
				}
					
					System.out.println(result);
					result++;
				
		 }		
		 System.out.println("종료");
	}

}
