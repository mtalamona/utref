import java.util.ArrayList;

public class hdPrinter implements Printer {

	public void print(ArrayList<Integer> serie, int serieNumber) {
		System.out.println("hdPrinter");
		
		
		// Remove brackets
        StringBuffer strbuffer = new StringBuffer();
        for (Integer str : serie) {
            strbuffer.append(str).append(" ");
        }
		
        // Print
        System.out.println("fibo<" + serieNumber + ">: " + strbuffer.toString());

	}

}
