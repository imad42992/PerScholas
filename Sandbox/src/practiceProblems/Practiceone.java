package practiceProblems;

import java.util.Scanner;

//Create a program that collects two strings of user input, and out the two strings concat


public class Practiceone {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name;
		String OS;
		
		
		
		System.out.println("Please enter your name");
		name=input.next();
		
		System.out.println("Please enter your preferred operating system");
		OS=input.next();
		
		
		System.out.printf("Okay %s, I see that you're a %s user.",name,OS);
	
		input.close();
	}
}
