package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception {

	public static void readFile(String location) throws FileNotFoundException{
		File file = new File(location);
		FileReader r = new FileReader(file);
	}
		
}
