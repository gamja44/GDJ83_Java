package com.winter.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력");
		String fileName = sc.next();
		
		File file = new File("c:\\study", fileName);
		FileWriter fw =null;
		
		try {
			fw = new FileWriter(file, true);
			
			//e,E가 입력되면 종료
			while(true) {
			System.out.println("입력");
			String s = sc.next();
				if(s.toUpperCase().equals("E")) {
					
					break;
				}
				
				fw.write(s+"\r\n");
				fw.flush();//버퍼를비워라
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("프로그램 종료");
		
	}

}
