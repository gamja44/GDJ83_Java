package com.winter.s2;

public class Student {

	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public info() {
		
	}
	
	public Middle(int num) {
		//생성자라인 첫 줄에 작성해야한다.
		super();//자식생성자안에는 기본적으로 슈퍼가있다
		//super는 기본생성자이다.
		//this()//this사용하고 싶을 경우에는 super삭제해야한다.
	}
	
	public Student(int num) {
		this.num =num;
	}
	
	
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
	
}
