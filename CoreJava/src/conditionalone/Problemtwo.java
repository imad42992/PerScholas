package conditionalone;

import java.util.Scanner;

public class Problemtwo {

	public static void main(String[] args) {
		
		int age = 0;
		String name = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hey, what's your name?");
		name=input.nextLine();
		
		System.out.println("Ok," + name + " how old are you?");
		age=input.nextInt();
		input.close();
		
		if (age<16)
			System.out.printf("You can't drive, %s\n",name);
		if (age<18)
			System.out.printf("You can't vote, %s\n",name);
		if (age<25)
			System.out.printf("You can't rent a car, %s\n ",name);
		if (age>=25)
			System.out.printf("You can do anything legal, %s\n ",name);
		
		
		
		
	}

}
