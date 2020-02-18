package org.perscholas;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car anotherCar = new Car(2019,"blue", "X5","bmw", 3.5);
		
		
		System.out.println(anotherCar.getColor());
		System.out.println(myCar.getColor());
		
		
		Suv mySuv = new Suv();
		Suv anotherSuv = new Suv(7, 2019, "red", "tahoe", "chevy", 4.0 );
		
		System.out.println("color "+anotherSuv.getColor());
		
		myCar.drive();
		mySuv.drive();
		mySuv.stop();
		
		mySuv.setSeats(7);
		
		System.out.println(mySuv.getSeats());
		System.out.println(anotherSuv.getSeats());
		
	}

}
