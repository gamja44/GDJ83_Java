package com.winter.s4.io;

import java.io.File;

public class FileMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//study2 폴더를 삭제
		File file = new File("C:\\study2");
		file.exists();
		System.out.println(file.exists());
		
		//파일객체.delete();
		//파일리스트꺼내기 listFiles 사용하기
		File[] ar = file.listFiles();
		for(File f : ar) {
			f.delete();
		}
		file.delete();
		
	}

}
