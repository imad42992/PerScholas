package javaConditionalexamples;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year to check to see if it's a leap year");
		int year = input.nextInt();
		input.close();
		
		if ((year%4==0)&&(year%100!=0)||(year%400==0)){
			System.out.printf("%d is a leap year",year);
		}
		else {
			System.out.printf("%d is not a leap year",year);
			
		}
	}
}
