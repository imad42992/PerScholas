package com.perscholas;

import java.util.Scanner;

public class CoffeeExample {

	public static void main(String[] args) {
		
	       Scanner scan = new Scanner(System.in);
	        int input = 0, coffee = 0, tea = 0, sandwich = 0;
	        double coffeeprice = 2.5, teaprice = 1.99, sandwichprice = 5.86, totalprice = input+teaprice+sandwichprice;
	        while (input != 4) {
	            System.out.println("Select one of below options:");
	            System.out.println("1- Add Coffee ($2.50)");
	            System.out.println("2- Add Tea ($1.99)");
	            System.out.println("3- Add Sandwich($5.86)");
	            System.out.println("4- Exit");
	            input = scan.nextInt();
	            if (input == 1) {
	                coffee++;
	                System.out.println("One Coffee added!" + coffeeprice);
	            } else if (input == 2) {
	                tea++;
	                System.out.println("One Tea added!" + teaprice);
	            } else if (input == 3) {
	                sandwich++;
	                System.out.println("One Sandwich added!" + sandwichprice);
	            } else if (input == 4) {
	            
	                System.out.println("You Ordered: ");
	                System.out.println(coffee + " Coffee(s)");
	                System.out.println(tea + " Tea(s)");
	                System.out.println(sandwich + " Sandwich(s)");
	                System.out.println("Your total for today is: " + totalprice);
	                System.out.println("Thank you!");
	            }
	        }
	    }
	}
