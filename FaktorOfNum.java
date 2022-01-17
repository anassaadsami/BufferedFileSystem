package BufferedReaderWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;



public class FaktorOfNum {
// with BufferedReader we must throws IOException in all methods or try-catch block
	public static void main(String[] args) throws IOException {
		try {
		BufferedReader br = new BufferedReader
							(new InputStreamReader(System.in));
		System.out.print("enter your no: ");
		String s = br.readLine();
		System.out.println("n\tn!");
		int n = Integer.parseInt(s);
		System.out.println(n+"\t"+fakt(n));
		br.close();
		}catch(Exception e) {
			System.out.println("invalid input.");
		}
	}
	public static double fakt(int n)throws InputMismatchException {
		int f = 1;
		for (int i = n; i > 0; i--) {
			f *= i ;
		}
		return f ;
	}

}
