package conditionalone;

import java.util.Scanner;

public class Problemfive {
	
	public static void Daysoftheweek(int input) {
		if (input <1 || input >7)
			System.out.println("Invalid Entry");
		else if(input==1)
			System.out.println("Monday");
		else if (input==2)
			System.out.println("Tuesday");
		else if (input==3)
			System.out.println("Wednesday");
		else if (input==4)
			System.out.println("Thursday");
		else if (input==5)
			System.out.println("Friday");
		else if (input==6)
			System.out.println("Saturday");
		else if (input==7)
			System.out.println("Sunday");
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number (1-7)");
		int day=0;
		day=input.nextInt();
		input.close();
		Daysoftheweek(day);
		
	}

}
