package com.perscholas;

import java.util.Scanner;

public class Questiontwo {

	public static void main(String[] args) {
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		
		Scanner input = new Scanner(System.in);
	
		String fname;
		System.out.println("What's your first name?");
		fname = input.next();
		
		String lname;
		System.out.println("What's your last name?");
		lname = input.next();
		
		int grade;
		System.out.println("What grade are you currently in (Grade 9-12)?");
		grade = input.nextInt();
		
		int id;
		System.out.println("What is your ID number?");
		id = input.nextInt();
		
		String login;
		System.out.println("What is your login?");
		login = input.next();
		
		double gpa;
		System.out.println("What is your gpa? (0.0-4.0");
		gpa = input.nextDouble();
		
		System.out.println(
				
				"\n Your Information:" +
				"\n Login: " + login +
				"\n ID: " + id +
				"\n Name: " + lname + ", " + fname +
				"\n GPA: " + gpa +
				"\n Grade " + grade
				
				
				);
		
		
		
		input.close();
		
		

	}

}
