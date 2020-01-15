package javaConditionalexamples;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	double weight;
	double height;
	
	
	System.out.println("Enter your weight in kilograms: ");
	weight = input.nextDouble();
	
	System.out.println("Enter Height in meters: ");
	height = input.nextDouble();
	
	input.close();
	
	double bmi = weight / (Math.pow(height, 2));
	System.out.println("Your BMI is " + bmi);
	
	if (bmi < 18) {
		System.out.printf("%.2f Underweight", bmi);
	}
	else if (18.5 <= bmi && bmi < 25)	{
	System.out.printf("%.2f Normal", bmi);
	
	}
	else if (25 <= bmi && bmi < 30) {
		System.out.printf("%.2f Overweight", bmi);
	}
	else {System.out.printf("%.2f Obese", bmi);
	}
}
}