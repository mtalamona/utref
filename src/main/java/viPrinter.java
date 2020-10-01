import java.util.ArrayList;
import java.util.Collections;

public class viPrinter implements Printer {

	public void print(ArrayList<Integer> serie, int serieNumber) {
		System.out.println("viPrinter");
		
		// Invert order
		Collections.sort(serie, Collections.reverseOrder());
		
		// Print serie title
		System.out.println("fibo<" + serieNumber + ">: ");
		
		// Remove brackets and print
        for (Integer str : serie) {
        	System.out.println(str);
        }

	}

}
