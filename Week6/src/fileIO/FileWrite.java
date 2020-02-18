package fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		// 1. The path
		String location = "C:\\Users\\imad4\\eclipse-workspace\\Files\\Imad6.csv";

		// 2. Object of type file
		File file = new File(location);

		// 3. object of type fileWriter
		FileWriter writer;

		try {
			writer = new FileWriter(file, false);
			// 4. use write to write something to the file
			writer.write("\"Hi JD, welcome, to, Java\n\"");

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
