package classExample;

import java.util.HashSet;

public class HashSetExamples {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
		for(String s : set) {
			System.out.println(s);
		}

	}

}
