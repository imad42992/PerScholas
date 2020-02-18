package com.perscholas;

import java.util.Scanner;

public class Sandbox {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Value");
		float d = input.nextFloat();
		
		float Celsius = (d-32)* 5/9;
		System.out.println("Temp is "+ Celsius);
		
	}

}
