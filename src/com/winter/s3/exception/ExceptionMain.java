package com.winter.s3.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		int num =10;
		
		System.out.println("숫자입력");
		int num2  = sc.nextInt();
		
		System.out.println(num/num2);
		throw new ArithmeticException();
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}catch(InputMismatchException e) {
			System.out.println("숫자 이 외에는 입력하지마세요");
		}catch (Exception e) {
			System.out.println("exception");
		}catch (Throwable e) {
			System.out.println("thriowable");
		}
		Exception1 ex1 = new Exception1();
		
		try {
			ex1.ex1(0);
		}catch (ArithmeticException e) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램이 종료");

	}

}
