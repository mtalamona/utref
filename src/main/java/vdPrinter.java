import java.util.ArrayList;

public class vdPrinter implements Printer {

	public void print(ArrayList<Integer> serie, int serieNumber) {
		System.out.println("vdPrinter");

		// Print serie title
		System.out.println("fibo<" + serieNumber + ">: " );
		
		// Remove brackets and print
        for (Integer str : serie) {
        	System.out.println(str);
        }

	}

}
