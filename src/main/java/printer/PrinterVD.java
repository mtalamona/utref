package printer;

import printer.Printer;

import java.util.ArrayList;

public class PrinterVD implements Printer {

	public void print(ArrayList<Integer> serie, int serieNumber) {

		// Print serie title
		System.out.println("fibo<" + serieNumber + ">: " );
		
		// Remove brackets and print
        for (Integer str : serie) {
        	System.out.println(str);
        }

	}

}
