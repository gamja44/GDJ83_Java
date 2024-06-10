package com.winter.s2.util.collections.ex3;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain {

	public static void main(String[] args) {
		Collection1 c1 = new Collection1();
		Collection2 c2 = new Collection2();
		
		List<Integer> ar = c1.makeList();
		//c2.useList(ar);
		//c1을 c2로 보낼거야
		c2.useList(c1.makeList());
		
		
		
		
		

	}

}
