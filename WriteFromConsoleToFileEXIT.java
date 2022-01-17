package BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WriteFromConsoleToFileEXIT {

	public static void main(String[] args) {

		String x;
		File f = null;

		try {
			f = new File("/Users/Hiba/Desktop/dataOfObjects/", "type_of_abonnemang"); // just change the name of file
																						// and use the program
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // to write into another file
			System.out.println("enter your next:");
			x = br.readLine();
			while (!x.equals("exit")) {
				try {
					BufferedWriter bwr = new BufferedWriter(new FileWriter(f, true)); // this constructor which takes
																						// boolean as parameter
					bwr.write(x); // it means we will append to the file otherwise it will be
					bwr.newLine(); // overwritten to all old data
					bwr.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				x = br.readLine(); // without this code it will be infinite loop ??
			}
			br.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
