package printer;

import printer.Printer;

import java.util.ArrayList;

public class PrinterHD implements Printer {

	public void print(ArrayList<Integer> serie, int serieNumber) {

		// Remove brackets
        StringBuffer strbuffer = new StringBuffer();
        for (Integer str : serie) {
            strbuffer.append(str).append(" ");
        }
		
        // Print
        System.out.println("fibo<" + serieNumber + ">: " + strbuffer.toString());

	}

}
