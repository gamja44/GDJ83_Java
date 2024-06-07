package com.winter.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {
	
	private StringBuffer sb;
	private Scanner sc;
	
	public ProductService() {
		sb = new StringBuffer();
		sb.append("50000, 아이폰, 50,");
		sb.append("45000, 갤럭시,100,");
		sb.append("30000, 노키아, 20");
	}
	//init메서드 만들고 파싱해서 Arraylist에 만들어서 리턴하자
	public ArrayList<ProductDTO> init() {
		ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();
		
		String dates = sb.toString();
		
		System.out.println(dates);		
		
		//ProductDTO productDTO = new ProductDTO();
		//ar.add(productDTO);
		
		StringTokenizer st = new StringTokenizer(dates, ",");
		
		while(st.hasMoreTokens()) {
			
			ProductDTO productDTO = new ProductDTO();
			
			productDTO.setPrice(Integer.parseInt(st.nextToken().trim()));
			productDTO.setTitle(st.nextToken().trim());
			productDTO.setStock(Integer.parseInt(st.nextToken().trim()));
			
			ar.add(productDTO);			 	
		}
		return ar;
		
	}
	//기존의 가방에다가 새상품을 추가 
	//메인에서 받고 주자
	//메소드 선언부는 수정불가
	public void addProduct(ArrayList<ProductDTO> ar) {
		ProductDTO productDTO = new ProductDTO();
		//정보를 입력받아서 기존 가방에 추가하자
		System.out.println("정보입력받기");
		
		System.out.println("가격을 입력");
		productDTO.setPrice(sc.nextInt());
		System.out.println("상품명을 입력");
		productDTO.setTitle(sc.next());
		System.out.println("재고량을 입력");
		productDTO.setStock(sc.nextInt());
		ar.add(productDTO);
		
	}
	//기존의 가방을 받아서 삭제, 물건의 이름을 입력받아서 삭제
	public int remove(ArrayList<ProductDTO> ar) {
		System.out.println("삭제할 상품명을 입력하세요");
		String name = sc.next();
		
		int result = 0;
		for(int i=0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getTitle())) {
				ar.remove(i);
				break;
			}
		}
		return result;
		
		
	}
	
}
