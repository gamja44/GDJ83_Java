package com.winter.s3;

public class S3Main {

	public static void main(String[] args) {
		
	//배열 선언 
	//모을려고하는 데이터타입
	//8개의 다른 데이터 타입을 다 같이 담으려고 해야한다
	//그것은 인터페이스 
	//다형성=폴리모프 모습변경시키기 즉,타입의 변경 ->형변환 
	//다형성은 레퍼런스타입의 형변환 조건 상속관계에서만 가능
	//
	Tiger tiger = new Tiger();
	tiger.age=5;
	tiger.name="호돌이";
	Penguin penguin = new Penguin();
	
	Animal animal = tiger;//자동형변환 레퍼런스 다형성
	System.out.println(animal.name);
	tiger = (Tiger)animal;//다형성 부모자식관계만 가능하다
	
	
	Tiger [] dropShip = new Tiger[8];
	
	dropShip[0] =tiger;
		
		
		
		
		
		
		
		
	}

}
