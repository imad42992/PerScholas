package practiceProblems;

import java.util.Scanner;

public class Practicefour {

	public static void main(String[] args) {
	Scanner thisThingScanner = new Scanner(System.in);
		String response;
		
		
		System.out.println("Do you have money to buy ice cream? (Y/N)");
		response = thisThingScanner.next();
		//check for upper and lower case
 if (response.equalsIgnoreCase("Y")) {
	 System.out.println("That is true, ice cream time!");
 }
 else {
	 System.out.println("NO ICE CREAM FOR YOU!!!");
 }


//		if(iHaveMoney || friendHasMoney) {
//		System.out.println("We will buy ice cream");
//		} else {
//		  System.out.println("We can't buy ice cream");
//		}
	}

}
