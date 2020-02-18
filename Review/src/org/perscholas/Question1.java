package org.perscholas;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> examOne = new ArrayList<Integer>();
		ArrayList<Integer> examTwo = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter your first exam score");
			int a = input.nextInt();
			examOne.add(a);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter your second exam score");
			int b = input.nextInt();
			examTwo.add(b);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("The average score for student " + (i + 1) + " is: ");
			int avg = (examOne.get(i) + examTwo.get(i)) / 2;
			System.out.println(avg);
		}
	}

}
