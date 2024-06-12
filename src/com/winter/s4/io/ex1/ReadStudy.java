package com.winter.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadStudy {
	
	public List<MenuDTO> read() throws Exception{
		//info.txt파일 읽어오기
		//1.항목별로 파싱 후 출력
		//2.읽어서 파싱 후 DTO들을 만든 후에 리턴
		File file = new File("C:\\study", "info.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<MenuDTO> list = new ArrayList<MenuDTO>();
		
		while(true) {
			String s = br.readLine();	
		
			if(s==null) {
				break;
			}
			MenuDTO menuDTO = new MenuDTO();
			
			String[] ar = s.split(",");
			
				menuDTO.setMenuName(ar[0].trim());
				menuDTO.setPrice(Integer.parseInt(ar[1].trim()));
				menuDTO.setKal(Integer.parseInt(ar[2].trim()));	 
			
			}
			return List<MenuDTO>;
	}
}
