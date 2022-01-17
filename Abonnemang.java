package BufferedReaderWriter;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Abonnemang {
	@Override
	public String toString() {
		return "Abonnemang [price=" + price + ", gb=" + gb + ", company=" + company + "]";
	}

	int price;
	int gb;
	String company;

	public Abonnemang(int price, int gb, String company) {
		this.price = price;
		this.gb = gb;
		this.company = company;
	}
 // we create an object from every line in file which contains 3 value (1  price , 2 gb , 3 owner)
	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner(System.in);
		// now we try to read from the same file by using Scanner class
		try {
			File f = new File("/Users/Hiba/Desktop/dataOfObjects/", "type_of_abonnemang"); // just change the name of file
			Scanner scan = new Scanner(f);  //  or must just one String in this constructor
			int i = 0;
			Abonnemang[] y = new Abonnemang[6];
			while (scan.hasNextLine() && i <6 ) {
				y[i++] = new Abonnemang(scan.nextInt(), scan.nextInt(), scan.next());   // create every item in array
//				System.out.println(scan.nextLine());
			}

			for (int j = 0; j < y.length; j++) {
				System.out.println(y[j].toString());
			}

			scan.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		input.close();

	}

}

