import model.Argument;
import model.Fibo;
import printer.Printer;
import printer.PrinterFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        // Get the arguments
        Argument arguments = new Argument(args);
        
        // Calculate Serie
        Fibo fibo = new Fibo(arguments.getSerieNumber());
        ArrayList<Integer> serie = fibo.calculate();
               
        //Print Serie
        PrinterFactory printerFactory = new PrinterFactory();
        Printer printer = printerFactory.create(arguments.getPrintStyle());
        printer.print(serie, arguments.getSerieNumber());
        
    }

}