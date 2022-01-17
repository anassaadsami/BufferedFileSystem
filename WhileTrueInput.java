package BufferedReaderWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileTrueInput {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader
								(new InputStreamReader(System.in));
		double firstNum;
		while (true) {
			System.out.println("enter the num: ");
			String s = input.readLine();
			firstNum = Double.parseDouble(s); // fˆrsta talet

			if (s == null)
				break;
			double tal = Double.parseDouble(s); // n‰sta tal
			if (tal > firstNum)
				firstNum = tal;
		}
		System.out.println("Det firstNum talet ‰r " + firstNum);
		input.close();
	}

}
