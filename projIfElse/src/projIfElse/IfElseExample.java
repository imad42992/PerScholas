package projIfElse;

public class IfElseExample {
	public static void main(String [] args) {
		//Joe's requirement:
		//if day value is 1 then print Monday
		//if day value is 2 then print Tuesday
		//if day value is 3 then print Wednesday
		//if day value is 4 then print Thursday
		//if day value is 5 then print Friday
		//if day value is 6 then print Saturday
		//if day value is 7 then print Sunday
		//if day value is greater than or equal to 1, then print "Weekday"
		//in range use && always
		//in random value use || 
		
		int dayValue; //variable declaration
		dayValue = 6; //assignment statement
		if (dayValue ==1)
			System.out.println("Monday");
		if (dayValue ==2)
			System.out.println("Tuesday"); //Bug: When actual result is not equal to expected result
		if (dayValue ==3)
			System.out.println("Wednesday");
		if (dayValue ==4)
			System.out.println("Thursday");
		if (dayValue ==5)
			System.out.println("Friday");
		if (dayValue ==6)
			System.out.println("Saturday");
		if (dayValue ==7)
			System.out.println("Sunday");
		if (dayValue>=1 && dayValue <=5) //ampersand, used for "and"
			System.out.println("Weekday");
		if (dayValue==6 || dayValue==7) // double pipe || stands for "or"
			System.out.println("Weekend");
			
	}//main

}//class
