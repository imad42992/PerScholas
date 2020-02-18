package org.perscholas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException{
	
			FileReader fr = new FileReader("C:\\Users\\imad4\\Desktop\\School Projects\\testexample.txt");
			BufferedReader br = new BufferedReader(fr);
			char c[] = new char[999];
			try {
			if(br.markSupported()) {
				System.out.println("mark() method is supported");
				for(int i = 0; br.read()!=-1;i++) {
					c[i]=(char) br.read();
					
					if(i == 99)
						br.mark(100);
					System.out.println("hello there i am at 100");
				}
				
					
					

				
				
			}
			br.skip(8);
			}finally {
				br.close();
			}

			for(char d: c) {
				System.out.println(d);
			}

	}
}
