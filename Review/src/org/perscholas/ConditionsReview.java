package org.perscholas;

public class ConditionsReview {

	public static void main(String[] args) {

		int x = 9;
		int y = 10;
		int sum = x + y;
		
		if(x<=y) {
			System.out.println("x <= y");
		}else
			System.out.println("y < x");
		
		switch(sum) {
		case 19:
			System.out.println("9+10");
			break;
		case 10:
			System.out.println("5+5");
			break;
			default:
				System.out.println("Hi!");
	}
	}
}
