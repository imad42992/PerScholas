package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
	
	public static void main(String[] args) {
		
		String location = "C:\\Users\\imad4\\eclipse-workspace\\Files\\Imad.txt";
	      File file = new File(location);
          System.out.println("Exists: "+file.exists());
          System.out.println("Path: "+file.getAbsolutePath());
          System.out.println("Read: "+file.canRead());
         
          try {
                  System.out.println("Created? "+ file.createNewFile());
                  
          }
          catch(IOException e) {
              e.printStackTrace();
          }
          System.out.println(file.exists());
          System.out.println(file.getAbsolutePath());
          System.out.println(file.canRead());
          System.out.println(file.canWrite());
          
          try {
          Scanner input = new Scanner(file);
          String data = "";
          while(input.hasNextLine()) {
        	  data+=input.nextLine();        	  
          }
    	  System.out.println(data);

          input.close();
          }catch (FileNotFoundException e) {
              e.printStackTrace();
          }
          
  }
}
