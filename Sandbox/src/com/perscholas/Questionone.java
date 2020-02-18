package com.perscholas;

import java.util.Scanner;

public class Questionone {

	public static void main(String[] args) {
		
		String name;
		int age;
		double wage;
		
		System.out.println("Hello. What's your name?");
		
		Scanner input = new Scanner(System.in);
		name=input.next();
		
		System.out.println("Hi "+ name+ "!" + " How old are you?");
		
		age= input.nextInt();
		
		System.out.println("So you're "+ age+",eh? That's not old at all! How much do you make, " + name + "?");
		
		wage= input.nextDouble();
		
		System.out.println(wage+"! That's really good for " +age+ "!");
		
		input.close();
		

	}

}
