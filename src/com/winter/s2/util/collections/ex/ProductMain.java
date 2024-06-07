package com.winter.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {
	public static void main(String[] args) {
		
		ProductService productservice = new ProductService();
		ArrayList<ProductDTO> ar = productservice.init();
		//System.out.println(ar);
		 int result = productservice.remove(ar);
		 
		 if(result>0) {
			 System.out.println("성공");
		 }else {
			 System.out.println("실패");			 
		 }
		
		for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i).getPrice());
		System.out.println(ar.get(i).getTitle());
		System.out.println(ar.get(i).getStock());
		}
		

		
		
	}
	
}
