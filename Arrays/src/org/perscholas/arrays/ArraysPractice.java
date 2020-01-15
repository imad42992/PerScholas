package org.perscholas.arrays;

import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args) {
//		Create a loop that will take an integer from user input.
//		If the integer is odd, add 1 and then divide that by 2 and print the new number.
//		If the integer is even, just divide by 2 and print the new number.
//		Continue doing this until you reach 1.
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers: ");
		int nums = input.nextInt();
		int[] var = new int[nums];
		
		for(int i = 0; i<nums; i++) {
		System.out.println("Enter your numbers: ");
		
		int a=input.nextInt();
		
		

		if (a%2!=0) {
			int b=(a+1)/2;
			}
		
		else if (a%2==0) {
			int c=(a/2);
			}
		var[i] = a;
	}
		
		
		
		

	}
}
