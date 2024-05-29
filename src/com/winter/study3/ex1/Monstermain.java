package com.winter.study3.ex1;

public class Monstermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Monster m = new Monster();//몬스터 객체 생성하기
//		m.name = "a";
//		m.level = 10;
//		m.species = "elfe";
//		System.out.println(m.name);
//		System.out.println(m.level);
//		System.out.println(m.ep);
//		
//		Monster m2 = new Monster();//몬스터 다른 객체 생성하기
//		m2.name ="b";
//		System.out.println(m2.name);
		//------------------------------------------------------------
		
		Monster monster = new Monster();
		monster.name = "철수";
		monster.level = 10;
		monster.exp = 500;
		monster.hp = 100;
		monster.species = "오크";

		Axe axe = new Axe();
		axe.name = "이빠진도끼";
		axe.damage = 10;
		axe.range = 1;
		axe.durability = 100;
		axe.upgrade = 0;

		monster.axe = axe;

		System.out.println(monster.axe.name);

		axe = new Axe();
		axe.name = "황금도끼"; //황금 도끼 찾았당 ^0^***

		System.out.println(monster.axe.name);

		Monster m2 = new Monster();
		m2.axe = axe;
		
	}

}
