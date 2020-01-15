package conditionalone;

public class Problemone {

	public static void main(String[] args) {
		
		int ppl =0;
		int cats =0;
		int dogs=0;
		
		if (ppl<cats) 
			System.out.println("Too many cats! The world is doomed!");
		else if(ppl>cats)
			System.out.println("Too few cats! The world is saved for another day!");
		else if(ppl==cats)
			System.out.println("No output");
		
		if (ppl<dogs)
			System.out.println("The world is drooled on!");
		else if(ppl>dogs)
			System.out.println("The world is dry!");
		else if(ppl==dogs)
			System.out.println("No output");
	}

}
