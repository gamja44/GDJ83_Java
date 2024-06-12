package com.winter.s4.io;

import java.io.File;

public class FileMain {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\study");
		System.out.println(file.exists());
		System.out.println(file.length());
		
		//file = new File("C:\\study", "test.txt");
		file = new File(file, "sub");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		
		
		if(!file.exists()) {
		file.mkdir();
	
		}
		file = new File("C:\\study\\sub2\\student");
		
		file.mkdirs();
		
		file = new File("C:\\study\\sub\\test.txt");
		file.delete();
		
		file = new File("C:\\study\\sub2");
		file.delete();
		
		file = new File("C:\\study");
		String[] list = file.list();
		
		File[] ar = file.listFiles();
		for(File f :ar) {
		
		if(file.isDirectory()) {
			System.out.println("true");
		}else{
			System.out.println("false");		
		}
	}
		
		
	}
}
