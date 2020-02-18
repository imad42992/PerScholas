package org.perscholas;

import java.util.Scanner;

public class ReviewLoops {

	public static void main(String[] args) {
		
		int num1, num2;
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
			System.out.println("Enter a number1: ");
			num1 = input.nextInt();
			
			if(num1 < 0)
				continue;
			System.out.println("Enter a number2: ");
			num2 = input.nextInt();
			if(num1+num2 > 10)
				break;
			System.out.println("The sum is: " + (num1+num2));
		}
		System.out.println("Thanks!");
		
	}

}
