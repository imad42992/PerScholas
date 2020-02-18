package projIfElse;

public class IfElse {
	public static void main(String [] args) {
		//Req: If employee age is 63 and up then print "Tax is 0%"
		//unless print "Tax is 8.5%"
		
		int Age;
		Age=4;
		if (Age <12) 
			System.out.println("Baby");
		else if (Age>=12 && Age<=18)
			System.out.println("Teen");
		else if (Age>18)
			System.out.println("Adult");
			
		
		
		//Req: if age is below 12 then print "Baby"
		//if age is 12 to 18 then print "Teen"
		//if age is 18 and up then print "Adult"
	

		
		
		
		
		
		//Req: if month value is 1 then print Jan
		//if month value is 2 then print Feb
		//...
		//if month value is 12 the print Dec
		
		
		int monthValue=2; //variable initialization
		if (monthValue==1) System.out.println("January");
		else if (monthValue==2) System.out.println("February");
		if (monthValue==2) System.out.println("February");
		if (monthValue==3) System.out.println("March");
		if (monthValue==4) System.out.println("April");
		if (monthValue==5) System.out.println("May");
		if (monthValue==6) System.out.println("June");
		if (monthValue==7) System.out.println("July");
		if (monthValue==8) System.out.println("August");
		if (monthValue==9) System.out.println("September");
		if (monthValue==10) System.out.println("October");
		if (monthValue==11) System.out.println("November");
		if (monthValue==12) System.out.println("December");
		
	}//main
}//class 


