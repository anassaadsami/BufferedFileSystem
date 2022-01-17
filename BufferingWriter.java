package BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferingWriter {

	public static void main(String[] args) {
		File f = null ;    // we must initialize f outside the try block 
		try {
			f = new File("/Users/Hiba/Desktop/outfolder", "buffering"); // create new file
			BufferedWriter bwr = new BufferedWriter(new FileWriter(f));
			bwr.write("Hi this is wirttem by BufferedWriter Class");
			bwr.write("\nWe can write by this method any String we want\n");
			bwr.newLine();
			bwr.write("GoodBye");
			bwr.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// here we use read() method to handle with every char in text 
		BufferedReader br = null;
		int count = 0 ;
		
		try {
			 br = new BufferedReader(new FileReader(f)); // we read from the same file
			int x;  // this method read 2 bytes (char) and return int ascII code for this char
			while ((x = br.read())!= -1) {        // so it means it handle with Character
				count++ ;
				// here we convert the lowerCase to upperCanse and all other char still the same
				if( Character.isLowerCase((char)x))  
				System.out.print(Character.toUpperCase((char)x));
				else if (Character.isUpperCase((char)x)) 
					System.out.print(Character.toLowerCase((char)x));
				else 
					System.out.print((char)x);
				
				}
			System.out.println("\nthe number of letters are: "+ count);

			br.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	
		 
		

	}

}
