package practiceProblems;

import java.util.Scanner;

public class Practicefive {

	public static void main(String[] args) {
//		Take two inputs from user
//		print both in one string
//		Get the String length
//		Multiply length by Pir^2
//		List all Results that Checks for Even and odd numbers
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string");
		String input1 = input.nextLine();
		System.out.println("Enter the next string");
		String input2 = input.nextLine();
		
	//	System.out.printf("Your 2 inputs were %s and %s.",input1,input2);
		System.out.println(input1+" "+input2);
		
		int a =input1.length();
		System.out.println(a);
		
		int b =input2.length();
		System.out.println(b);	
		
		int c =Math.addExact(a, b);
		System.out.println("String length is " + c);
		
		double exp= Math.pow(c, 2);
		double radius =(Math.PI*exp);
		System.out.println(radius);
		
		for(int i=1; i<=radius; i++)	{
			if(i %2 == 0)	{
				System.out.printf("%d even \n",i);
			}
			else {
				System.out.printf("%d odd \n",i);
			}
		}
		
		
		input.close();
	
	}

}
