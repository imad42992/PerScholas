package projIfElse;

public class JavaSwitch {
	public static void main (String[] args) {
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
				dayValue = 7; //assignment statement
				if (dayValue ==1)
					System.out.println("Monday");
				else if (dayValue ==2)
					System.out.println("Tuesday"); //Bug: When actual result is not equal to expected result
				else if (dayValue ==3)
					System.out.println("Wednesday");
				else if (dayValue ==4)
					System.out.println("Thursday");
				else if (dayValue ==5)
					System.out.println("Friday");
				else if (dayValue ==6)
					System.out.println("Saturday");
				else if (dayValue ==7)
					System.out.println("Sunday");
				//Java switch
				
				//Req: print weekday and weekend 
				
				switch (dayValue) {
				case 1: 
				case 2: 
				case 3: 
				case 4: 
				case 5: System.out.println("Weekday");
					break;
				case 6: System.out.println("Saturday");
				case 7: System.out.println("Weekend");
					break;
				default:
					System.out.println("Invalid");
				}//switch
				
				/*Syntax of switch
				switch([switch variable]) {
					case [value]:
						[case stmts];
						break;
				...
				default:
					[stmt];
					
				
				
				}
				*/
			
}
}