package projMethod;

public class MethodExample {
	static double[] empSalary;//global variable

	
	static void printArray() { 		//line 7 is method declaration, printArray=method name, void is return type
		for (int i=0; i<=2; i++) {			//method definition lines 7-9
			System.out.println("emp Sal " + empSalary[i]);
		}
		}//printArray method

	public static void main(String[] args) {
		//store 3 emp salary in array	//double
		empSalary = new double[3];
		
		empSalary[0]=40.99;
		empSalary[1]=70.00;
		empSalary[2]=60.00;
		
		printArray(); //method calling stmt
		
		for (int i=0; i<=2; i++) {
			System.out.println("emp Sal" + empSalary[i]);
		}
		printArray();

		System.out.println("======================");
		empSalary[1]=50.00;
		
		printArray();
		
		System.out.println("======================");
		empSalary[0]=55.00;
		
		printArray();
	
	}//main

}//class
