package projLooping;

public class Looping {
	public static void main(String[] args)  {
	//Req: Print Dallas 5 times in console
	/*
	System.out.println("Austin");
	System.out.println("Austin");
	System.out.println("Austin");
	System.out.println("Austin");
	System.out.println("Austin");
	*/
	/*
	int dayValue=1;
	dayValue++; //only increase value by 1
	System.out.println("line 15: " + dayValue);
	dayValue+=3; //increment can be any value
	System.out.println("line 17: " + dayValue);
	
	dayValue = dayValue + 1; //+ is called addition operator
	dayValue--; //only decrease value by 1
	dayValue*=3;
	dayValue = dayValue * 3;
	dayValue-=1;
	dayValue = dayValue - 1;
	dayValue++;
	System.out.println("line 24: " + dayValue);
								//+ is called concatenation operator
	
	//Syntax For Loop
	//for ([loop variable declaration and initialization]; 
	 * [loop condition]; [increment || decrement])
	//	  [loop stmt]
	*/
	for (int i= 1; i <=5; i++)//will keep going back to loop until statement becomes false
		System.out.println(i + " Dallas");
	
	//print USA 5 times
	for (int n=1; n<=5; n++)
		System.out.println("USA");
	
	//print even numbers from 1 to 20 in console
	for (int n=2; n<=20; n+=2)
		System.out.println(n);
	
	//print 3 6 9 12 15 in console
	for (int n=3; n<=15; n+=3)
		System.out.println(n);
		
	//print 9 to 1 in console
	
	for (int n=9; n>=1; n--) {
		System.out.println(n);
	}
	
	//print 5 to 1 in console
	//Tracing
	int n =0;
	for (int i = 4; i>=1; i--) {
		n = i + n;
		System.out.println(n);
		
	//print sum of number from 1 to 9
	int sum=0;
	for (int b=1; b<=9; b++) {
		sum = b;
	}
	}
}//main
}//class