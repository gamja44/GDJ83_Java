package com.winter.s1.lang.wrapper.ex;

public class WeatherService {
	
	//Controller Layer
	//business Layer 데이터 후처리
	//DAO layer
	
	private StringBuffer sb;
	
	public WeatherService() {
		
		this.sb = new StringBuffer();
		this.sb.append("서울 , 29.3 - 맑음 - 60");
		this.sb.append("-부산 , 33.6 - 흐림 - 50");
		this.sb.append("-제주 , 26.3 - 눈 - 60");
		this.sb.append("-광주 , 10.3 - 태풍 - 80");
		
	}
	
	public void init() {
		//sb에 있는것을 문자열 변수에 담아서 출력
		String info = sb.toString();
		System.out.println(info);
		
		
		String infos1 = info.replace(",", "-");
		//String info2 = infos1.replace(" ", "");
		String[] infos = infos1.split("-");
		for(int i=0;i<infos.length;i+=4) {

		WeatherDTO w =new WeatherDTO();
		w.setSity(infos[i].trim());
		w.setGion(Double.parseDouble(infos[i+1].trim()));
		w.setStatus(infos[i+2].trim());
		w.setHumidity(Integer.parseInt(infos[i+3].trim()));
		
		System.out.println(infos[i+1]);
		}
//		for(int i=0;i<infos.length;i++) {
//		System.out.println(infos[i]);
//		}
		
	}
	
}
