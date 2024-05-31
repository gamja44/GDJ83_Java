package com.winter.s2;


public class Middle extends Student {
	
//	public Middle() {
//		//생성자라인 첫 줄에 작성해야한다.
//		//super();//자식생성자안에는 기본적으로 슈퍼가있다
//		//super는 기본생성자이다.
//		//this()//this사용하고 싶을 경우에는 super삭제해야한다.
//	}
//	
	//상속받아서 역사를 추가하자
	private int history;
	
	public Middle() {
		super(10);
	}
	
	public void midInfo() {
		super.info();
		System.out.println(this.history);
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}
	
	
	
	
}
