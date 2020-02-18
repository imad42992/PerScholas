package org.perscholas;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		// App#1
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter two numbers: ");
//		int a=input.nextInt();
//		int b=input.nextInt();
//		int sum = a+b;
//		System.out.println(a + " " + b);
//		System.out.printf("%d %d \n", a,b);
//		System.out.println(sum);

		// App#2
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter 5 numbers: ");
//		int a=0,b=0,c=0,d=0,e=0,sum=0,avg=0;
//		
//		a=input.nextInt();
//		b=input.nextInt();
//		c=input.nextInt();
//		d=input.nextInt();
//		e=input.nextInt();
//		sum = a+b+c+d+e;
//		avg = sum/5;
//		System.out.println("sum is:"+sum);
//		System.out.println("avg is:" +avg);

		// App#3
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a number to check if it is even/odd: ");
//		int a=0;
//		a=input.nextInt();
//		
//		if(a%2==0) {
//			System.out.println("Even");
//		}
//		else
//			System.out.println("Odd");

		// App#4
//		Scanner input = new Scanner(System.in);
//		int a = 0;
//		System.out.println("Enter number to see if it is divisible by 5 or 3");
//		a=input.nextInt();
//		
//		if(a%5==0 && a%3==0)
//			System.out.println("FizzBuzz");
//		else if(a%5==0) {
//			System.out.println("Fizz");
//		}
//		else if(a%3==0) {
//			System.out.println("Buzz");
//		}

		// App#5
//		Scanner input = new Scanner(System.in);
//		int a = 0;
//		
//		System.out.println("Enter student grade: ");
//		a=input.nextInt();
//		
//		if(a>=90) {
//			System.out.println("A");
//		}
//		else if(a>=80 && a < 90) {
//			System.out.println("B");
//		}
//		else if(a>=70 && a < 80) {
//			System.out.println("C");
//		}
//		else if(a>=60 && a < 70) {
//			System.out.println("D");
//		}
//		else if(a<60) {
//			System.out.println("F");
//		}

		// App#6
//		Scanner input = new Scanner(System.in);
//		String a = "A";
//		while(!a.equals("q")) {
//			System.out.println("Enter letter grade or 'q' to exit: ");
//			a = input.next();
//			switch (a.toUpperCase()) {
//			case "A":
//				System.out.println("90-100");
//				break;
//			case "B":
//				System.out.println("80-89");
//				break;
//			case "C":
//				System.out.println("70-79");
//				break;
//			case "D":
//				System.out.println("60-69");
//				break;
//			case "F":
//				System.out.println("0-59");
//				break;
//			default:
//				System.out.println("Enter valid input");
//			}
//		}
//		System.out.println("Thank you!");
//		input.close();

		// App#7
//		Scanner input = new Scanner(System.in);
//
//		int num = 0;
//		int total = 0;
//
//		while (total <= 50) {
//			System.out.println("Please enter numbers:");
//			num = input.nextInt();
//			total = total + num;
//		}
//
//		System.out.println(total);

		// App#8
		Scanner in = new Scanner(System.in);
		int[] arr1 = new int[5];

		int arr2[] = new int[5];

		int[] arr3 = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter a number:");
			arr1[i] = in.nextInt();
		}
		
		for (int i : arr1)
			System.out.println(i);
		
		for(int i=0; i<arr1.length; i++)
			System.out.println(arr1[i]);

	}
}
