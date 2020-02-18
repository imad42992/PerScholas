package org.perscholas;

import java.util.Scanner;

public class Exercise3Regex {
	
	private static final String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public static void main(String[] args) {
		String email = "";
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter your email: ");
		email = input.next();
	}

	public static String getEmailPattern() {
		return EMAIL_PATTERN;
	}

}
