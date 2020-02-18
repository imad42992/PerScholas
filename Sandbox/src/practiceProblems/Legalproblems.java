package practiceProblems;

import java.util.Scanner;

public class Legalproblems {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = input.nextLine();
		
		System.out.println("Please enter your age, " + name);
		int age = input.nextInt();
		input.close();
		
		if(age<16)
			System.out.println("You can't Drive, " + name);
		
		if(age<18)
			System.out.println("You can't Vote, " + name);
		
		if(age<25)
			System.out.println("You can't rent a car, " + name);
		
		if(age>=25)
			System.out.println("You can do anything legal," + name);
		
	
		
	}

}
