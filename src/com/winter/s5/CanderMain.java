package com.winter.s5;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

public class CanderMain {

	public static void main(String[] args) {
		Calendar ca = new GregorianCalendar();
		
		
		//현재 시간과 날짜 정보가 만들어 짐
		ca = Calendar.getInstance();
		
		System.out.println(ca);

		System.out.println(ca.get(Calendar.YEAR));
		System.out.println(ca.get(Calendar.MONTH)+1);
		System.out.println(ca.get(Calendar.DATE));
		System.out.println(ca.get(Calendar.HOUR));
		
		//Date date = ca.getTime();
		Calendar future = Calendar.getInstance();
		future.set(Calendar.DATE, future.get(Calendar.DATE)+17 );
		
		//1995-3-12
		String n ="1995-3-12";
		String[] a =n.split("-");
		ca.set(Integer.parseInt(a[0]), Integer.parseInt(a[1])-1);
		
		ca = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년MM월DD일 hh:mm");
		String s=sd.format(ca.getTime());
		System.out.println(s);
		
		String id = UUID.randomUUID().toString();
		System.out.println(id);
		
		
		System.out.println(future.getTime());
		
		
		Single single = Single.get();
		
		
		
	
		
	}

}
