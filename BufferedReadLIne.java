package BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReadLIne {

	public static void main(String[] args) {
		// here we use readLine() to handle with whole line
		int count = 0 ;
		File f = null;
//		int x ;
		try {
			f = new File("/Users/Hiba/Desktop/outfolder/buffering");
			BufferedReader br = new BufferedReader
					(new FileReader(f));
			String line ;
			while((line = br.readLine()) != null) {
			System.out.println(line);
			}
			
		// counter for letters in the file 
			for (int i = 0; i < f.length(); i++) {    // i = 2 bytes ----> char 
//				x = br.read();    // we can get the count of char in text without this code
//				char ch = (char)x;
				count++ ;
				
			}
			
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("there is "+ count +" in "+f.getName());

	}

}
