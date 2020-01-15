package classExercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please Enter Student name:");
	String name = input.next();
	System.out.println("Enter Course:");
	String course = input.next();
	System.out.println("Enter Java Score:");
	double JavaScore = input.nextDouble();
	System.out.println("Enter SQL Score:");
	double SQLScore = input.nextDouble();
	System.out.println("Enter Web Score:");
	double WebScore = input.nextDouble();
	
	Student score = new Student(name,course,JavaScore,SQLScore,WebScore);
	
	score.InClass();
	score.pass();
	score.fail();
	
		
		
	}

}
