package Exception;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.Exception;
public class Main_exception  {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		try {
//			readFile("location");
//
//		} catch (FileNotFoundException e) {
//
//			System.out.println("Error: File not found!");
//		}
//		
		int[] arr = new int[2];
		
		try {
			for (int i = 0; i < 6; i++)
				System.out.println("value " + arr[i]);
		} catch (Exception e) {
			System.out.println("Please Enter two numbers:");
			int a = in.nextInt();
			int b = in.nextInt();
			int sum = a+b;
			System.out.println(sum);
			
		}
		
		finally
		{
			System.out.println("regardless");
			
		}
	}
	public static void readFile(String location) throws FileNotFoundException{
		File file = new File(location);
		FileReader r = new FileReader(file);
}
}