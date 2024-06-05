package com.winter.s1.lang.wrapper.ex;

public class WeatherView {
	//view
	//날씨들의 정보를 받아서 이쁘게 출력
	public void view(WeatherDTO[] dtos) {
		
		for(int i=0;i<dtos.length;i++) {
			System.out.println(dtos[i].getSity());
			System.out.println(dtos[i].getGion());
			System.out.println(dtos[i].getHumidity());
			System.out.println("------------------------");
		}
	}
	//날씨정보 하나를 출력하는 메소드도 만들어야한다
	public void view(WeatherDTO weatherDTO) {
		
		if(weatherDTO != null) {
			
			System.out.println(weatherDTO.getSity());
			System.out.println(weatherDTO.getGion());
			System.out.println(weatherDTO.getHumidity());
			System.out.println("------------------------");
		}else {
			System.out.println("날씨정보가 없다");
		}
		
	}
	
	
	
}
