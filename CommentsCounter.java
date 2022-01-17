package BufferedReaderWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommentsCounter {

	
		public static void main(String[] arg) throws IOException {
		    var input = new BufferedReader
		               (new InputStreamReader(System.in));
		    System.out.print("Vad heter filen med Javaprogrammet? ");
		    String filnamn = input.readLine();
		    BufferedReader br = new BufferedReader
		                            (new FileReader("outfolder/"+ filnamn));
		    int n = 0,    // totala antalet rader i filen
		        k = 0;    // antalet rader med kommentarer
		    while (true) {
		      String rad = br.readLine();
		      if (rad == null)  // ‰r filen slut?
		        break;   // ja!
		      n++;   // nej
		      if (rad.indexOf("//") >= 0)
		        k++;   // kommentar finns pÂ raden
		    }
		    System.out.println(100.0*k/n + " % av raderna innehÂller kommentarer");
		    br.close();
		    
	}

}
