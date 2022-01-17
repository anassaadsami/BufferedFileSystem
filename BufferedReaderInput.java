package BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class BufferedReaderInput {

	public static void main(String[] args){
		try {
			System.out.print("enter your integer: ");
			BufferedReader br = new BufferedReader
					(new InputStreamReader(System.in));   // cause we take the data from user by 
															// command Window (keyboard)
			String x = br.readLine();
			int y = Integer.parseInt(x);
			System.out.println(y + 100);
			System.out.print("enter your float: ");
			x = br.readLine();
			float h = Float.parseFloat(x);
			System.out.println(h + 100);
			br.close();
		} catch (IOException e) {
			System.out.println("invalid input");
		}
	 catch (NumberFormatException e) {        // this catch the exception when we enter char instead of int 
		System.out.println("invalid input");    // and program try to convert this char to int in line 17 
	}                                           // and without this catch will be error
		System.out.println("thanks");
				

	}

}
