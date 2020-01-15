package javaConditionalexamples;

import java.util.Scanner;

public class Computingtaxes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(
				"Enter your status:\n1= Single"
				+ "\n2= Married filing jointly\n3= Married filing Seperately\n4= Head of Household\n");
		int status = input.nextInt();
		System.out.printf("Enter your yearly income\n");
		int income = input.nextInt();
		input.close();

		switch (status) {

		case 1:
			if (income <= 8350) {
				double tax = income * 0.1;
				System.out.printf("Your tax payment is %d X 0.1 = %.2f", income, tax);
			} else if ((income >= 8351) && (income <= 33950)) {
				double tax = income * .15;
				System.out.printf("Your tax payment is %d X 0.15 = %.2f", income, tax);
			} else if ((income >= 33951) && (income <= 82250)) {
				double tax = income * .25;
				System.out.printf("Your tax payment is %d X 0.25 = %.2f", income, tax);
			} else if ((income >= 82251) && (income <= 171550)) {
				double tax = income * .28;
				System.out.printf("Your tax payment is %d X 0.28 = %.2f", income, tax);
			} else if ((income >= 171551) && (income <= 372950)) {
				double tax = income * .33;
				System.out.printf("Your tax payment is %d X 0.33 = %.2f", income, tax);
			} else {
				double tax = income * .35;
				System.out.printf("Your tax payment is %d X 0.35 = %.2f", income, tax);
			}
			break;
			
		case 2:
			if (income <= 16700) {
				double tax = income * 0.1;
				System.out.printf("Your tax payment is %d X 0.1 = %.2f", income, tax);
			} else if ((income >= 16701) && (income <= 67900)) {
				double tax = income * .15;
				System.out.printf("Your tax payment is %d X 0.15 = %.2f", income, tax);
			} else if ((income >= 67901) && (income <= 137050)) {
				double tax = income * .25;
				System.out.printf("Your tax payment is %d X 0.25 = %.2f", income, tax);
			} else if ((income >= 137051) && (income <= 208850)) {
				double tax = income * .28;
				System.out.printf("Your tax payment is %d X 0.28 = %.2f", income, tax);
			} else if ((income >= 208851) && (income <= 372950)) {
				double tax = income * .33;
				System.out.printf("Your tax payment is %d X 0.33 = %.2f", income, tax);
			} else {
				double tax = income * .35;
				System.out.printf("Your tax payment is %d X 0.35 = %.2f", income, tax);
		}
			break;
		case 3:
			if (income <= 8350) {
				double tax = income * 0.1;
				System.out.printf("Your tax payment is %d X 0.1 = %.2f", income, tax);
			} else if ((income >= 8351) && (income <= 33950)) {
				double tax = income * .15;
				System.out.printf("Your tax payment is %d X 0.15 = %.2f", income, tax);
			} else if ((income >= 33951) && (income <= 68525)) {
				double tax = income * .25;
				System.out.printf("Your tax payment is %d X 0.25 = %.2f", income, tax);
			} else if ((income >= 68526) && (income <= 104425)) {
				double tax = income * .28;
				System.out.printf("Your tax payment is %d X 0.28 = %.2f", income, tax);
			} else if ((income >= 104426) && (income <= 186475)) {
				double tax = income * .33;
				System.out.printf("Your tax payment is %d X 0.33 = %.2f", income, tax);
			} else {
				double tax = income * .35;
				System.out.printf("Your tax payment is %d X 0.35 = %.2f", income, tax);
			}
			break;
		case 4:
			if (income <= 11950) {
				double tax = income * 0.1;
				System.out.printf("Your tax payment is %d X 0.1 = %.2f", income, tax);
			} else if ((income >= 11951) && (income <= 45500)) {
				double tax = income * .15;
				System.out.printf("Your tax payment is %d X 0.15 = %.2f", income, tax);
			} else if ((income >= 45501) && (income <= 117450)) {
				double tax = income * .25;
				System.out.printf("Your tax payment is %d X 0.25 = %.2f", income, tax);
			} else if ((income >= 117451) && (income <= 190200)) {
				double tax = income * .28;
				System.out.printf("Your tax payment is %d X 0.28 = %.2f", income, tax);
			} else if ((income >= 190201) && (income <= 372950)) {
				double tax = income * .33;
				System.out.printf("Your tax payment is %d X 0.33 = %.2f", income, tax);
			} else {
				double tax = income * .35;
				System.out.printf("Your tax payment is %d X 0.35 = %.2f", income, tax);
			}
			break;
	
		}
	}
}


