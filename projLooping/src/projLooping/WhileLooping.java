package projLooping;

public class WhileLooping {

	public static void main(String[] args) {
		//syso, then ctrl, then space for shortcut
		// write a program that can print
		// 1 to 5
		/*
		for (int i=1; i<=5; i++) {
		System.out.println(i);

		}
		*/
		// Write a program that can print 5 to 1 using DO loop
		/*
		int n=5;
		do {
			System.out.println(n);
			n--;
		} while (n>=1);
		/*
		*/
		//Write a program that can print 5 to 1 using WHILE loop
		/*
		int n=5;
		while (n>=1) {
			System.out.println(n);
			n--;
		}
		*/
		//tracing example
		int sum =0, i =5;
		while (i!=0) {
			sum = sum + i;
			--i;
		}
		System.out.println("sum=" + sum);
		
		
	
		// Write a program that can print 1 to 5 using DO loop
		/*
		int n=1;
		do {
			System.out.println(n);
			n++;
		} while (n<=5);
		//Do while loop executes its stmt at least one time
		
		// Write a program that can print 1 to 5 using WHILE loop
		/*
		int i=1;
		while (i<=5) {
			System.out.println(i);
			i++;
		}
		/*syntax of WHILE
		 [loop variable declaration and initialization]
		 while (loop condition){
		 	[loop stmts]
		 	[loop increment]
		 }
		 */
	}//main

}//class

