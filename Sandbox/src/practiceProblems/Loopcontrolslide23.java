package practiceProblems;

import java.util.Scanner;

public class Loopcontrolslide23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = -1;
		int sum = 0;
		
		while(number != 0) {
			System.out.println("Enter a number: ");
			number = input.nextInt();
			sum += number;
	}
		
		System.out.println("Sum of entered number: " + sum);
		input.close();

}
}