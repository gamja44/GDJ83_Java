package com.winter.s4.io.ex1;

public class Ex1Main {
	public static void main(String[] args) {
		ReadStudy rs = new ReadStudy();
		try {
			rs.read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
