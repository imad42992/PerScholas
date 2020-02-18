package practiceProblems;

import java.util.Scanner;


public class Practiceseven {
	
	public static void main(String[] args) {
		
		//Create Scanner object to collect input
		Scanner input = new Scanner(System.in);
		
		//generate rand number betweeen 1 & 10
		int rand = (int) (Math.random()*10)+1;
		
		//generate rand number between 1 & 10
		int rand2 = (int) (Math.random()*10)+1;
		
		//Prompt the user to enter an answer
		System.out.printf("What is %d + %d\n",rand,rand2);
		
		//Store users response into a variable
		int response = input.nextInt();
		
		//test users response to confirm its correct
		if(response == rand +rand2)
		
		{//Print stmt if users answer is correct
			System.out.println("This is correct!");
		}
		else 
		
		{//print stmt if users answer is incorrect
			System.out.println("Incorrect, please try again");
		}
		input.close();
		
	
	}

}
