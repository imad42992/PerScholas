package com.perscholas;

import java.util.Scanner;

public class Whileloopslide20 {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int rand1= (int) (Math.random() * 10);
	int rand2= (int) (Math.random() * 10);
	
	int ans = rand1 + rand2;
	
	int userAns=0;
	
	while (userAns != ans) {
		System.out.printf("What is %d + %d =",rand1,rand2);
		userAns = input.nextInt();
		System.out.printf("Wrong answer, try again \n");
	}
	input.close();
	
}
}
