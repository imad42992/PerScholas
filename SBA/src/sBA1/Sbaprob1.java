package sBA1;

public class Sbaprob1 {

	public static void main(String[] args) {
//  1. Write a program to sum up all the even numbers until the 25th number in the Fibonacci series.
		
		int num1 = 0;
		int num2= 1;
		int num3,i,sum=25;
		
		for(i=2;i<sum;++i)
		{
		
		num3=num1+num2;
		
		if(num3%2==0)
		
		System.out.print(" "+num3);
		num1=num2;
		num2=num3;
		}
		
	
	
	
	}//main
	}//class