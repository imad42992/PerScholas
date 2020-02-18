package org.perscholas;

import java.util.Scanner;

public class ReviewArrays {

	public static void main(String[] args) {

//		int[] myArr1d = {1,2,3};
//		//Printout Array elements
//		//way1
//		System.out.println(myArr1d);
//		System.out.println(myArr1d[0]);
//		System.out.println(myArr1d[1]);
//		System.out.println(myArr1d[2]);
//		
//		//way2
//		for(int i=0; i<myArr1d.length;i++) 
//			System.out.println(myArr1d[i]);
//		
//		
//		//way3	
//		for(int x : myArr1d)
//			System.out.println(x);
//		
//		//change array element values
//		for(int i=0; i<myArr1d.length; i++)
//			myArr1d[i]=0;
//		
//		for(int t: myArr1d)
//			System.out.println(t);
		Scanner in = new Scanner(System.in);

		System.out.println("How many students? ");
		int size = in.nextInt();

		double[] scores = new double[size];
		double[] scores1 = new double[size];
		System.out.println("Enter student score: ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = in.nextDouble();
			scores1[i] = in.nextDouble();
		}
		System.out.println("Do you want to change a score? (Y/N)");
		String answer = in.next().toUpperCase();

		if (answer.equals("Y")) {
			System.out.println("Which exam score would you like to replace? ");
			int examNum = in.nextInt();
			System.out.println("Enter the student number: ");
			int studNum = in.nextInt();
			System.out.println("Enter the new score: ");
			switch (examNum) {
			case 1:
				scores[studNum - 1] = in.nextDouble();
				break;
			case 2:
				scores1[studNum - 1] = in.nextDouble();
				break;
			}
			avg(scores);
			avg(scores1);
		} else {
			avg(scores);
			avg(scores1);
		}

//		int[] arr1d2 = new int[3];
//		System.out.println(arr1d2);

	}

	public static void avg(double[] scores) {
		double sum = 0.0, avg = 0.0;

		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = sum / scores.length;
		System.out.println("The average of the two test scores is: " + avg);
	}

}
