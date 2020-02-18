package sBA3;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class sbaProb2 {
	
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

			System.out.println("How many users would you like to create?");
			int num=input.nextInt();
			String[] arr = new String[num];
			
			System.out.println(name_create(arr));
			
			
	}
	public static boolean CkSt(String str) {
		return ((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$")));
	}
	
	private static ArrayList<String>name_create(String[] arr){
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println("Enter usernames one at a time:");
			
			String in = input.next();
			if(CkSt(in)) {
			arr[i] = in;
			}
			
			else {
				i--; System.out.println("You must enter letters only");
			}
			
		}
		Map<String,Integer> add = new HashMap<String,Integer>();
		ArrayList<String>  names = new ArrayList<String>();
		
		for(String user:arr) {
			if(!add.containsKey(user)) {
				add.put(user, 1);
				names.add(user);
			}
			else if(add.containsKey(user)) {
				int plus = add.get(user);
				add.put(user, ++plus);
				names.add(user+plus);
			}
		}
		
		return names;
}
}