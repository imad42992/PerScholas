package com.perscholas;

public class TestMethods {

	public static void main(String[] args) {
		
		int num1=1, num2 = 2, num3=3;
		
		//int sum = num1+num2+num3;
		int returnOfSum = Sum(num1,num2,num3);
		
		//double avg = returnOfSum/3;
		double returnOfAvg = Avg(returnOfSum);
		
		//int mult = num1*num2*num3;
		int returnOfMult = Mult(num1,num2,num3);
		
		//System.out.println(returnOfSum +" " + avg + " " +mult);
		PrintResults(returnOfSum, returnOfAvg, returnOfMult);
	}
	
	private static void PrintResults(int returnOfSum, double returnOfAvg, int returnOfMult) {
		
		System.out.println(returnOfSum + " " + returnOfAvg + " " + returnOfMult);
	}

	private static int Mult(int num1, int num2, int num3) {
		return num1*num2*num3;
	}

	static int Sum(int n1,int n2,int n3) {
		int calc = n1+n2+n3;
		return calc;//return must be last line of method
	}
	
	static double Avg(int sum) {
		double calc = sum/3;
		return calc;
	}
}
