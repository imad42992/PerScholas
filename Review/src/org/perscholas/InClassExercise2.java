package org.perscholas;

import java.util.Scanner;

public class InClassExercise2 {

	public static void main(String[] args) {
		String name = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your full name seperated by spaces");
		
		while(!name.contains(" ")) {
		name = input.nextLine();
		}
		System.out.println("Welcome " + name);
	}

}
