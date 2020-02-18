package practiceProblems;
import java.util.Scanner;
public class Practicesix {

	public static void main(String[] args) {
		//Write a Java program to print the odd numbers from 1 to 99 based on user input. Prints one number per line.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value from 1 to 99");
		int userinput= input.nextInt();
		
		for (int i=userinput; i<=99; i++) {
		if (i%2!=0) {
			System.out.printf("%d \n",i);
		}
	}

}
}