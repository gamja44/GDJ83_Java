package com.winter.study1;

public class Study3 {
	public static void main(String [] args) {
		//연산자: + - * / %
		// + 산술연산자
		// + 연결연산자 : 문자열 + primitive =>문자열
		System.out.println("1"+1);
		System.out.println(1+"1"+1);
		System.out.println(1+'a'+"1"); //'a'가 int타입으로 자동변환
		
		//물건을 고르고, 물건의 합계, 돈을 내고 결제
		int total =15760;
		int don = 50000;
		//잔돈계산
		int jandon = don - total;
		//만원갯수를 담을 변수
		int man = 0;
		int ch = 0;
		int bac = 0;
		int si= 0;
		int won = 0;
		
		//첫번째 방법
		man =jandon/10000;
		ch = (jandon-(man*10000))/1000;
		bac = (jandon-(man*10000)-(ch*1000))/100;
		si = (jandon-(man*10000)-(ch*1000)-(bac*100))/10;
		won = (jandon-(man*10000)-(ch*1000)-(bac*100)-(si*10))/1;
				
		System.out.println("잔돈 : " + jandon);
		System.out.println("만원 : " + man + "장");
		System.out.println("천원 : " + ch + "장");
		System.out.println("백원 : " + bac +"백원");
		System.out.println("십원 : " + si +"십원");
		System.out.println("원 : " + won +"원");
		
		//두번째방법
		man = jandon/10000;
		ch = jandon%10000/1000;
		bac = jandon%1000/100;
		si = jandon%100/10;
				
		System.out.println("잔돈 : " + jandon);
		System.out.println("만원 : " + man + "장");
		System.out.println("천원 : " + ch + "장");
		System.out.println("백원 : " + bac +"백원");
		System.out.println("십원 : " + si +"십원");
//		System.out.println("원 : " + won +"원");
	}
	
}
