package com.winter.study3.ex4;

public class ExMain4 {
	
	public static void main(String[] args) {

		// new 생성자호출
		Car car = new Car();

		car.info();

		Car car2 = new Car(200);
		car2.info();

		Bike bike = new Bike("", 4);

	}
}
