package acceptance;

import model.Argument;
import model.Fibo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import printer.Printer;
import printer.PrinterFactory;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFiboAcceptance {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private final String[] args = {"-o=vd", "5"};
    private final String[] argsPartial = {"5"};
    private final String[] argsInvalid = {"xxx xxx xxx"};
    private final String[] argsValidSerieInvalidPrint = {"-o=xx", "5"};
    private final String serieOutputStringHD = "fibo<5>: 0 1 2 3";
    private final String serieOutputStringHI = "fibo<5>: 3 2 1 0";
    private final String serieOutputStringVD = "fibo<5>: \n0\n1\n2\n3";
    private final String serieOutputStringVI = "fibo<5>: \n3\n2\n1\n0";
    private final String errorMessageExpected = "Opciones no validas.";

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @DisplayName("When_Fibonacci_Of_5_With_Invalid_Print_Arguments_Expect_ErrorMessage()")
    @Test
    void When_Fibonacci_Of_5_With_Invalid_PrintArguments_Expect_ErrorMessage() {
        // Given invalid arguments, Argument should fail
        Argument arguments = new Argument(argsValidSerieInvalidPrint );

        // Then
        assertTrue(outputStreamCaptor.toString().trim().contains(errorMessageExpected));
    }

    @DisplayName("When_Fibonacci_Of_5_With_Invalid_Arguments_Expect_ErrorMessage()")
    @Test
    void When_Fibonacci_Of_5_With_Invalid_Arguments_Expect_ErrorMessage() {

        // Given invalid arguments, Argument should fail
        Argument arguments = new Argument(argsInvalid);

        // Then
        assertTrue(outputStreamCaptor.toString().trim().contains(errorMessageExpected));
    }

    @DisplayName("When_Fibonacci_Of_5_Without_Print_Arguments_Expect_Valid_Serie_Printed_Horizontal_Direct")
    @Test
    void When_Fibonacci_Of_5_Without_PrintArguments_Expect_ValidSerie_Printed_HorizontalAndDirect() {

        // Calculate Serie
        Argument arguments = new Argument(argsPartial);
        Fibo fibo = new Fibo(arguments.getSerieNumber());
        ArrayList<Integer> serie = fibo.calculate();

        // Print Serie
        PrinterFactory printerFactory = new PrinterFactory();
        Printer printer = printerFactory.create("hd");
        printer.print(serie, arguments.getSerieNumber());

        // Then
        assertEquals(serieOutputStringHD, outputStreamCaptor.toString().trim());
    }


    @DisplayName("When_Fibonacci_Of_5_With_PrintArguments_hd_Expect_Valid_Serie_Printed_HorizontalAndDirect()")
    @Test
    void When_Fibonacci_Of_5_With_PrintArguments_hd_Expect_Valid_Serie_Printed_HorizontalAndDirect() {
        // Calculate Serie
        Argument arguments = new Argument(args);
        Fibo fibo = new Fibo(arguments.getSerieNumber());
        ArrayList<Integer> serie = fibo.calculate();

        // Print Serie
        PrinterFactory printerFactory = new PrinterFactory();
        Printer printer = printerFactory.create("hd");
        printer.print(serie, arguments.getSerieNumber());

        // Then
        assertEquals(serieOutputStringHD, outputStreamCaptor.toString().trim());
    }

    @DisplayName("When_Fibonacci_Of_5_With_PrintArguments_hd_Expect_Valid_Serie_Printed_HorizontalAndReverse")
    @Test
    void When_Fibonacci_Of_5_With_PrintArguments_hd_Expect_Valid_Serie_Printed_HorizontalAndReverse() {
        // Calculate Serie
        Argument arguments = new Argument(args);
        Fibo fibo = new Fibo(arguments.getSerieNumber());
        ArrayList<Integer> serie = fibo.calculate();

        // Print Serie
        PrinterFactory printerFactory = new PrinterFactory();
        Printer printer = printerFactory.create("hi");
        printer.print(serie, arguments.getSerieNumber());

        // Then
        assertEquals(serieOutputStringHI, outputStreamCaptor.toString().trim());
    }

    @DisplayName("When_Fibonacci_Of_5_With_PrintArguments_vd_Expect_Valid_Serie_Printed_VerticalAndDirect()")
    @Test
    void When_Fibonacci_Of_5_With_PrintArguments_vd_Expect_Valid_Serie_Printed_VerticalAndDirect() {
        // Calculate Serie
        Argument arguments = new Argument(args);
        Fibo fibo = new Fibo(arguments.getSerieNumber());
        ArrayList<Integer> serie = fibo.calculate();

        // Print Serie
        PrinterFactory printerFactory = new PrinterFactory();
        Printer printer = printerFactory.create("vd");
        printer.print(serie, arguments.getSerieNumber());

        // Then
        assertEquals(serieOutputStringVD, outputStreamCaptor.toString().trim());
    }

    @DisplayName("When_Fibonacci_Of_5_With_PrintArguments_vi_Expect_Valid_Serie_Printed_VerticalAndReverse()")
    @Test
    void When_Fibonacci_Of_5_With_PrintArguments_vi_Expect_Valid_Serie_Printed_VerticalAndReverse() {
        // Calculate Serie
        Argument arguments = new Argument(args);
        Fibo fibo = new Fibo(arguments.getSerieNumber());
        ArrayList<Integer> serie = fibo.calculate();

        // Print Serie
        PrinterFactory printerFactory = new PrinterFactory();
        Printer printer = printerFactory.create("vi");
        printer.print(serie, arguments.getSerieNumber());

        // Then
        assertEquals(serieOutputStringVI, outputStreamCaptor.toString().trim());
    }

}