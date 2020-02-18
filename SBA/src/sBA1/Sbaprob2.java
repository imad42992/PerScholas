package sBA1;

import java.util.Scanner;

public class Sbaprob2 {
	
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a word:");	
		String abc = input.next();
		input.close();
		
		int a = 0;
		
		for(a = 1; a < abc.length(); a++) {
			
		if(abc.charAt(a) < abc.charAt(a-1)) {
			System.out.println("Not abcederian");
			break;
		}//if stmt
		else if(a== abc.length()-1) {
			System.out.println("Abcederian word");
		}//else if
		
		}//for loop
		
	}//main

}//class
