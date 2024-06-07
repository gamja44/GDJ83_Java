package com.winter.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names = "winter,20, iu,25, hani,30, 철수,40, 영희,37";
		
		StringTokenizer st = new StringTokenizer(names, ",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			String age = st.nextToken();
			System.out.println(name.trim());
		}
		
		 String[] n = names.split(",");
		
			
	}

}
