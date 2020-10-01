import java.util.ArrayList;
import java.util.Collections;

public class hiPrinter implements Printer {

	public void print(ArrayList<Integer> serie, int serieNumber) {
		System.out.println("hiPrinter");
        
		// Invert order
		Collections.sort(serie, Collections.reverseOrder());
		
		// Remove brackets
        StringBuffer strbuffer = new StringBuffer();
        for (Integer str : serie) {
            strbuffer.append(str).append(" ");
        }
		
        // Print
        System.out.println("fibo<" + serieNumber + ">: " + strbuffer.toString());

	}
		
}
