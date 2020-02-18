package projArray;

public class ArrayExample {

	public static void main(String[] args) {
		//Requirement: Store 3 employee ages
		// 34, 62, 27
		
		int[] empAge;
		empAge= new int[3];
		empAge[0]=34;
		System.out.println("1st emp age=" + empAge[0]);
		empAge[1]=62;
		System.out.println("2nd emp age=" + empAge[1]);
		empAge[2]=27;
		System.out.println("3rd emp age=" + empAge[2]);
		System.out.println("JOE: 1st emp age=" + empAge[0]);
		
		//Create an array and store 10 emp salary //double variable
		double[] empSalary;
		empSalary = new double[10];
		empSalary[0]=20000.00;
		empSalary[1]=30000.00;
		empSalary[2]=40000.00;
		empSalary[3]=50000.00;
		empSalary[4]=60000.00;
		empSalary[5]=70000.00;
		empSalary[6]=80000.00;
		empSalary[7]=90000.00;
		empSalary[8]=100000.00;
		empSalary[9]=110000.00;
			
			for (int i = 0; i<=9; i++) {
				System.out.println(empSalary[i]);
			}
	}//main

}//class
