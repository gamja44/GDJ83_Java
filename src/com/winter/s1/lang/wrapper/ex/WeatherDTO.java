package com.winter.s1.lang.wrapper.ex;

public class WeatherDTO {
	
	//DTO의 모든 멤버변수는 private 설정
	//getters/setters 필요
	//생성자는 여러게 만들어도 상관없지만 기본생성자는 필수
	
	private String sity;
	//도시명
	private double gion;
	//기온
	private String status;
	//날씨정보
	private int humidity;
	//습도
	public String getSity() {
		return sity;
	}
	public void setSity(String sity) {
		this.sity = sity;
	}
	public double getGion() {
		return gion;
	}
	public void setGion(double gion) {
		this.gion = gion;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
	
	
	
}
