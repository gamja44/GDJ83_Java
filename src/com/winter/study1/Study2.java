package com.winter.study1;

public class Study2 {
	
	public static void main(String [] args){
		//변수선언
		//int age=30;
		//System.out.println(age);
		
		//Reference type 객체
		//String name=new String("winter");스트링은 원래 이렇게 사용
		//개발자들이 귀찮아서 변함
		String name="winter";
		
		int age=1;
		String na="1";
		//System.out.println(age==na);
		//연산자는 같은 타입끼리만 연산이 가능
		//산술연산자 : + - * / %
		//자바스크립트 System.out.println("1"*1);
		
		//형변환(Cascading)
		//Primitive 타입끼리만 형변환 가능(boolean제외)
				
		//형태의 변환(type의 변환)
		long num1 = 30L;
		//강제 형변환, 명시적 형변환(명시하겠다)
		//큰 타일을 작은 타입에 넣을 때
		int num2 = (int)num1;
		
		float f1 =1.2F;
		//묵시적 형변환, 자동 형변환
		//작은 타입을 큰 타입에 넣을 때 
		double d1=f1;
		
		//자동형변환
		//byte->short,char->int ->long ->float->double
		//수 표현의 갯수(비트 조합)
		//1.000000000001 1이라고 생각
		
		int total = 100;
		double avg = (double)total/3; //3.0으로 임력해서 더블로 사용이 가능하다.
		
		avg=33.22;
		total=(int)avg*10; //10곱해서 332를 만듬
		System.out.println(avg);
		System.out.println(total);
		
		//over flow
		byte b = 127;
		byte b1 =1;
		b =(byte)(b+b1);
		//under flow
		
		
		
		
		
		
	}
}
