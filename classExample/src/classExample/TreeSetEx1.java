package classExample;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
		for(String s : set) {
			System.out.println(s);
			
		}
		System.out.println(set.size());
	}

}
