package org.perscholas;

import java.util.Scanner;

public class InClassExercise {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number");
		
		int x = input.nextInt();
		if (x % 2 == 0 && x > 0) {
			System.out.println("Even Number");
		} else if (x % 2 != 0 && x > 0) {
			System.out.println("Odd Number");
		} else if (x < 0) {
			System.out.println("Invalid Number");
		}
	}

}
