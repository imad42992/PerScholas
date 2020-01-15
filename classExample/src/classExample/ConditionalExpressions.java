package classExample;

import java.util.Scanner;

public class ConditionalExpressions {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter either 0 or 1");
		
		int x = input.nextInt();
		
		int y = (x > 0) ? 1: -1;
		
		System.out.printf("Y= %d",y);
		
		input.close();
		
	}

}
