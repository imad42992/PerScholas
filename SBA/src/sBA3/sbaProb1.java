package sBA3;



import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class sbaProb1 {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a random word with repeating letters:");
		String a = input.next();
		
		char[] arr = a.toCharArray();
		Map<Character, Integer> count = new TreeMap<Character, Integer>();
		
		for(char Letter:arr) {
			if(!count.containsKey(Letter)) {	count.put(Letter, 1);
			}
			
			else if(count.containsKey(Letter)) {
				int plus = count.get(Letter); count.put(Letter,  ++plus);
			}
		}
			count.forEach((k,v)->{	
			
			if(v==1) {
					System.out.println(k);
				}
			else {
				System.out.println(k+""+v);
			}
			});
			System.out.println();
			System.out.println(count);
	}
}