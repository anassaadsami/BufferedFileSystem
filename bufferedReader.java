package BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class bufferedReader {

	public static void main(String[] args) {
		int x = 0 ;
		String line;
		int count = 0;
		int countDigit = 0;
		int letterCount = 0;
		File f = null;
		BufferedReader br = null;
		BufferedReader br1 = null;

		try {
			f = new File("/Users/Hiba/Desktop/outfolder/infolder", "text1.TXT");
//			FileReader fr = new FileReader(f);   // we can without this line also
			br = new BufferedReader(new FileReader(f));
			br1 = new BufferedReader(new FileReader("/Users/Hiba/Desktop/outfolder/infolder/copytext1.TXT"));
			// this method read the whole line and check it if it equals null to continue
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				count++; // this counter for lines

			}
			// for count the char in the file without print it 
			
			while((x= br1.read()) != -1) {    // without ((x = br1.read() != -1 )
				letterCount++ ;
				char ch = (char)x;     // we can get the count of char in text without this code
				if(Character.isDigit(ch))
					countDigit++ ;
					
				
			}
			// another way to count the letters in text
//			for(int i = 0 ; i < f.length(); i++) {
//				x = br.read();
//				char ch = (char)x;
//				letterCount++ ;
//			}

			br.close();
			br1.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(count);
		System.out.println(letterCount);
		System.out.println(countDigit);

	}

	

}
