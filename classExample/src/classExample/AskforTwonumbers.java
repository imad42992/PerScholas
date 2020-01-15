package classExample;

import java.util.Scanner;

/***
 * 
 * @author Imad R. Killedar
 *
 */


public class AskforTwonumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter 2 numbers");
		double a = input.nextDouble();
		double b = input.nextDouble();

		double sum = a + b;
		double product = a * b;
		double average = sum / 2;

		System.out.printf("The sum is: %.0f\nThe product is: %.0f\nThe average is: %.2f\n", sum, product, average);

		input.close();
	}

}
