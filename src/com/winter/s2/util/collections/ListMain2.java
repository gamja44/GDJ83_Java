package com.winter.s2.util.collections;

import java.util.ArrayList;

public class ListMain2 {
	public static void main(String[] args) {
		//ArrayList<String> ar = new ArrayList<String>();
		ArrayList<String> ar = new ArrayList();
		ArrayList<Integer> ar2 = new ArrayList();
		
		
		ar.add("first");
		//ar.add(2);
		//ar.add('c');
		//ar.add(true);
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));	
		}
		
		String name = (String)ar.get(0);
	}
}
