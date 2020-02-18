package practiceProblems;

import java.util.Scanner;

public class Practicethree {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the radius");
		
		double r = input.nextDouble();
		double pi = Math.PI;
		double exp = Math.pow(r, 2);
		
		System.out.println(pi*exp);

				

	}

}
