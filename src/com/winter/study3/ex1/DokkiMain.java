package com.winter.study3.ex1;

public class DokkiMain {

	public static void main(String[] args) {
		
		Dokki d = new Dokki();
		d.name="do";
		d.damage=50;
		d.nagudo=100;
		d.sageri=10;
		d.enlevel=20;
//		System.out.println(d.name);
//		System.out.println(d.damage);
//		System.out.println(d.nagudo);
//		System.out.println(d.sageri);
//		System.out.println(d.enlevel);
		//------------------------------
		
		Dokki d2 =d;
		d2.name="kki";
		System.out.println(d2.name);
		//------------------------------
		
		Dokki d3 = new Dokki();
		System.out.println(d3.name);
		d3.name = "ge";
		System.out.println(d3.name);
		d3.name = d.name;
		System.out.println(d3.name); //객체가 생성하지않고 d2에서 kki를 덮었다.
		
		
		
		//------------------------------
		
		


		



	}

}
