package com.winter.s1.lang.buffer;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(); //문자열을 누적하고 싶을 때
		StringBuilder sb2 = new StringBuilder();
		
		//winter + iu
		sb.append("winter");
		sb.append("iu");
		sb.append(10);
		
		String result = sb.toString();//데이터타입이 다르다
		System.out.println(sb);//winteriu10, 내부적으로 object의 toString으로 재정의되어서 나온다
		System.out.println(result);
		
	}

}
