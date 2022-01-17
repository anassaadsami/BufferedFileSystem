package BufferedReaderWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFromConsoleToFile {

	public static void main(String[] args) {
		// in this program we don't have read method but only we write String lines from console to file 
		Scanner input = new Scanner(System.in);
		try {
			File f = new File("/Users/Hiba/Desktop/dataOfObjects/", "Array of shoes");
			BufferedWriter bwr = new BufferedWriter(new FileWriter(f, true));
			System.out.println("enter your text:");
			String x = input.nextLine();    // to read just one line and store it in String x and write it into file
			
			bwr.write(x);
			bwr.newLine();  // its for begin write in new line every time
			 
			bwr.close();
			System.out.println("done");
		} catch (IOException e) {
			System.out.println(e);
		}
		input.close();
		

	}

}
