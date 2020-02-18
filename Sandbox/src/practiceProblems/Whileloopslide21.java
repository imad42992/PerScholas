package practiceProblems;

import java.util.Scanner;

public class Whileloopslide21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int rand = (int) (Math.random()*100+1);
		System.out.printf("Random number is: %d\n",rand);
		
		int userInput = 0;
		
		while(rand!=userInput) {
			System.out.println("Enter a random number from 0 to 100: ");
			userInput = input.nextInt();
			
			if (userInput > rand) {
				System.out.println("Your answer is higher than the random number");
			}
			else if (userInput < rand) {
				System.out.println("Your answer is lower than the random number");
			}
			else if (userInput == rand) {
				System.out.println("That's correct!");
			}
			
		}
			input.close();

	}

}
