package com.winter.study3.ex1;

public class GameController {
	//start메소드 선언 -> 프린트문작성
	public void start() {
		
		//몬스터 생성 1마리, 그룹 3마리 생성
		//몬스터를 생성하는 클래스를 따로 만들기
		MonsterFactory mf = new MonsterFactory();
		Monster m = mf.createMonster();
		System.out.println(m.name);
		System.out.println(m.level);
		
		Monster[] monsters = mf.createMonsterGroup();
		
		for(int i=0;i<monsters.length;i++) {
		System.out.println("=============================");
		System.out.println(monsters[i].name);
		System.out.println(monsters[i].level);
		}
		//System.out.println("시작합니다");
	}
	
	
	//메인2 메인메서드에서 start메소드 호출
}
