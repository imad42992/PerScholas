package practiceProblems;

public class Conditionaloneproblemone {

	public static void main(String[] args) {
		
		//setting 3 different vars as int
		int ppl = 2, cats = 2, dogs= 2;
		
		//if stmt to print if there are less ppl than cats
		if (ppl < cats) System.out.println("Too many cats! The world is doomed");
		else if (ppl > cats)  System.out.println("Too few cats! The world is saved for another day!");
		else if ((ppl == 0 ) || (cats == 0)) System.out.println("No values set");
		
		//if stmt to print if there are less ppl than dogs
		if (ppl < dogs) System.out.println("The world is drooled on!");
		else if (ppl > dogs) System.out.println("The world is dry!");
		else if ((ppl == 0) || (dogs == 0)) System.out.println("No values set");
		
	}

}
