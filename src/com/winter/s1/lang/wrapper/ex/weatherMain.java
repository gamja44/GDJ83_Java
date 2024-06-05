package com.winter.s1.lang.wrapper.ex;

public class weatherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WeatherDTO[] dtos = new WeatherService().init();		
//		WeatherView v = new WeatherView();
//		v.view(dtos);
		
		WeatherController wc = new WeatherController();
		wc.start();
	}

}
