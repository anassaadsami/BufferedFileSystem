package BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;



public class BufferedWriterFromBufferedInputReader {

	public static void main(String[] args) {
		
		// here we write data by command window (console) and the program read all written unless exit word and write all 
		// data to the file 
		String x ;
		
		try {
			File f = new File("/Users/Hiba/Desktop/outfolder/","buffering");
			BufferedReader br = new BufferedReader
					(new InputStreamReader(System.in));
			System.out.println("enter your next:");
			 x = br.readLine();
			while(!x.equals("exit")) {
				try {
					BufferedWriter bwr = new BufferedWriter
									(new FileWriter(f,true));     // this constructor which takes boolean as parameter 
//					bwr.newLine();
				    bwr.write(x+"\n");                                 // it means we will append to the file otherwise it will be 
					bwr.newLine();                                // overwritten to all old data 
					bwr.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				x = br.readLine();               // without this code it will be infinite loop ??
			}
			br.close();
			System.out.println("done");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
