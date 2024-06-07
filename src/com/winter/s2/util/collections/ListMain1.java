package com.winter.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {
	
	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		String name="winter";
		int num = 2;
		ar.add(name);
		ar.add(num);//interger 언박싱
		ar.add(3.12);//오토박싱되어서 들어감
		ar.add('a');
		ar.add(false);
		ar.add(num);
		
		ar.add(1, "test");
		ar.set(0, 'c');
		ar.remove(0);
		ar.remove(2);
		ar.clear();
		
		for(int i=0; i<ar.size();i++) {
		System.out.println(ar.get(i));
		
		}
		
		LinkedList lk = new LinkedList();
		lk.add("ad");
		
		
		
		
		
		
	}
	
	
	
}
