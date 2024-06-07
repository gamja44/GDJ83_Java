package com.winter.s1.lang.wrapper.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

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
	public WeatherDTO[] init() {
		//sb에 있는것을 문자열 변수에 담아서 출력
		String info = sb.toString();
		
		String infos1 = info.replace(",", "-");
		//String info2 = infos1.replace(" ", "");
		String[] infos = infos1.split("-");
		
		WeatherDTO[] dtos= this.useTokenizer(info);
		
		return dtos;		
		
	}
	private WeatherDTO[] useTokenizer(String info) {		
		WeatherDTO[] weatherDTO = new WeatherDTO[4];
		ArrayList<WeatherDTO> arrays = new ArrayList<WeatherDTO>();
		
		StringTokenizer st = new StringTokenizer(info, "-");
		int idx=0;
		while(st.hasMoreTokens()) {
			WeatherDTO weatherDTO1 =new WeatherDTO();
			
			String city = st.nextToken().trim();
			double gion = Double.parseDouble(st.nextToken().trim()); 
			String status = st.nextToken().trim();
			int humidity =Integer.parseInt(st.nextToken().trim());
			
			weatherDTO1.setSity(city);
			weatherDTO1.setGion(gion);
			weatherDTO1.setStatus(status);
			weatherDTO1.setHumidity(humidity);
			arrays.add(weatherDTO1);
			
			ar[idx] = weatherDTO; 
			idx++;
			
		}
		
		return ar;
	}
	
	
	
	
	
	
	private WeatherDTO[] getWeathers(String[] infos) {
		
	WeatherDTO[] dtos = new WeatherDTO[infos.length/4];
			
			int	idx = 0;
			for(int i=0;i<infos.length;i+=4) {
				WeatherDTO w =new WeatherDTO();
				w.setSity(infos[i].trim());
				w.setGion(Double.parseDouble(infos[i+1].trim()));
				w.setStatus(infos[i+2].trim());
				w.setHumidity(Integer.parseInt(infos[i+3].trim()));		
				dtos[idx]=w;
				idx++;
			
		}
		
		return dtos;
	}
	//날씨정보를 도시명으로 검색, 도시를 찾으면 출력이 가능하게 만들어준다.
		//해당 날씨정보를 리턴
		//findByCity
		public WeatherDTO findByCity(Scanner sc, WeatherDTO[] ar) {
			WeatherDTO weatherDTO =null;
			//null값을 쓰는 이유는 밑에 실행 메서드가 결과물이 달랐을 때 null값이 나오게끔 일부러 사용하는 것
		
			System.out.println("검색할 도시명을 입력");
			String cityName = sc.next();
			
				for(int i=0;i<ar.length;i++) {
					if(cityName.equals(ar[i].getSity())) {
						weatherDTO = ar[i];
						break;
					}
				}
			return weatherDTO;
		}
		//날씨정보 추가
		//addWeather
		//도시명, 기온, 습도, 상태를 입력받아서 기존의 날씨정보들에 추가
		//한번 생성된 배열은 수정할 수 없기때문에 다시 배열을 선언해서 추가
		public void addWeather(Scanner sc, WeatherDTO[] ar) {
			WeatherDTO weatherDTO = new WeatherDTO();
			System.out.println("도시명을 입력");
			weatherDTO.setSity(sc.next());
			weatherDTO.setHumidity(sc.nextInt());
			weatherDTO.setGion(sc.nextInt());
			weatherDTO.setStatus(sc.next());
			
			WeatherDTO[] newAr = new WeatherDTO[ar.length+1];
			for(int i=0;i<ar.length;i++) {
				
				newAr[i] = ar[i];
				newAr[ar.length]=weatherDTO;
			}for(int i=0;i<newAr.length;i++) {
				
				System.out.println(newAr[i]);
				
			}
			//removeWeather
			//기본배열에서 하나를 삭제 앞에 있을 수도 있고 뒤에 있을 수도 있음
			//도시명을 입력받아서 일치하는 날씨 정보 삭제
			//continue; 사용해서 건너뛰고 올라가는 것 다시 올라간다? for문을 이용
			//넣는거 따로 찾는것 따로
			//일단 도시명을 찾아서 입력
			//remove(int index)        : index 번호의 요소를 삭제
			//java.util.List 사용해보자
		public void removeWeather(Scanner sc, WeatherDTO[] ar) {
			WeatherDTO weatherDTO = new WeatherDTO();
			
			
			WeatherDTO[] newdelet = new WeatherDTO[ar.length-1];
			for(int i=0;i<ar.length-1;i++) {
				
					
			}
			
			
		}
			
			
			
			
			
		}	
			
		
	
//	for(int i=0;i<infos.length;i++) {
//	System.out.println(infos[i]);
//	}
	
	//2번째 방법
//	WeatherDTO[] dtos = new WeatherDTO[infos.length/4];
	
//	int	idx = 0;
//	for(int i=0;i<dtos.length;i++) {
//		WeatherDTO w =new WeatherDTO();
//		w.setSity(infos[idx].trim());
//		w.setGion(Double.parseDouble(infos[++idx].trim()));
//		w.setStatus(infos[++idx].trim());
//		w.setHumidity(Integer.parseInt(infos[++idx].trim()));
//		dtos[idx]=w;
//	}
	
	
}
