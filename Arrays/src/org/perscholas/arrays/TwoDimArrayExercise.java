package org.perscholas.arrays;

import java.util.Scanner;

public class TwoDimArrayExercise {

	public static void main(String[] args) {

		int studNo = 0;
		int examNo = 0;
		double[][] examScores2D;
		double[]examScores1D;
		double[] studAvg;
		double total= 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		studNo=scan.nextInt();
		
		String[] studNames = new String[studNo];
		studAvg = new double[studNo];
		
		System.out.println("Enter the number of exams: ");
		
		examNo=scan.nextInt();
		
		examScores2D = new double[studNo][examNo];
		
		for(int i=0;i<studNo;i++) {
			System.out.println(i+1 + "- Enter Student name ");
			studNames[i]= scan.next();
			
			
		for(int j=0;j<examNo;j++) {
			System.out.println("Enter exam score: ");
			examScores2D[i][j]=scan.nextDouble();
			total += examScores2D[i][j];
		}
		studAvg[i]=total/examNo;
		total=0.0;		
	}
		
		for(int i=0;i<studNo;i++) {
			System.out.println(studNames[i] + " ");
			for(int j=0;j<examNo;j++) {
			System.out.println(examScores2D[i][j] + " ");
		}
			System.out.println(studAvg[i]);
	}
}
}