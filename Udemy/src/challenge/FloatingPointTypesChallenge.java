package challenge;

import java.util.Scanner;

public class FloatingPointTypesChallenge {

	public static void main(String[] args) {
		//convert user input pounds to kg 
		Scanner input = new Scanner(System.in);
		double pounds,kilo;
		
		System.out.println("Please enter a number in pounds to convert to kg:");
		
		pounds = input.nextDouble();
		kilo = (pounds/2.2);
		System.out.printf("%f pounds is %.3f kilograms",pounds,kilo);
		double numberOfPounds = 200d;
		double convertedKilograms = numberOfPounds * 0.45359237d;
		System.out.println("Converted Kilograms =" + convertedKilograms);
		
		double pi = 3.1415927d;
		double anotherNumber = 3_000_000.4_567_890d;
		System.out.println(pi);
		System.out.println(convertedKilograms);
	
	}

}
