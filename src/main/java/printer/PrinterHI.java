package printer;

import printer.Printer;

import java.util.ArrayList;
import java.util.Collections;

public class PrinterHI implements Printer {

	public void print(ArrayList<Integer> serie, int serieNumber) {

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
