package org.perscholas.arrays;

import java.util.Scanner;

public class OneDimArrayExercise {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int student = input.nextInt();
		String name[]= new String[student];
		double score []= new double[student];
		int exam []= new int[student];
		
		for(int e=0;e<1;e++) {
		System.out.println("Enter number of exams:");
		exam[e]=input.nextInt();
		}
		for (int i=0; i<student;i++) {
		System.out.println("Please Enter Student Name: ");
		name[i]=input.next();
		System.out.printf("Please enter the score for %s",name[i] +":\n");
		score[i]=input.nextDouble();
		}
		
		for (int j=0;j<student;j++) {
			System.out.printf("%s has a score of %d\n",name[j],score[j]);
		}
		
		System.out.println();
		
		input.close();
		
		

	}}
