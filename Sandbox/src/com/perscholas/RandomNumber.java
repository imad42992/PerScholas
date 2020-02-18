package com.perscholas;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);

		System.out.print("Enter some number: ");
		int username = keyboardInput.nextInt(); // .nextDouble(), .nextInt()
		System.out.println("Hello, " + username);


}
}