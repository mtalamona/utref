package unit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import printer.Printer;
import printer.PrinterFactory;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTests {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final ArrayList<Integer> serie = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));

        // Given Fibonacci de 5
        serie.add(0);
        serie.add(1);
        serie.add(2);
        serie.add(3);
    }

    @DisplayName("Impresion: hi (horizontal invertido)")
    @Test
    void Fibonacci_Of_5_PrintMode_hi_Should_Print_Horizontal_Reversed() {

        // Given PrintMode: hi
        PrinterFactory printerFactory = new PrinterFactory();
        Printer printer = printerFactory.create("hi");

        // When Print Serie
        printer.print(serie, 5);

        // Then
        assertEquals("fibo<5>: 3 2 1 0", outputStreamCaptor.toString().trim());

    }

    @DisplayName("Impresion: hd (horizontal directa)")
    @Test
    void Fibonacci_Of_5_PrintMode_hd_Should_Print_Horizontal_Direct() {

        // Given PrintMode: hi
        PrinterFactory printerFactory = new PrinterFactory();
        Printer printer = printerFactory.create("hd");

        // When Print Serie
        printer.print(serie, 5);

        // Then
        assertEquals("fibo<5>: 0 1 2 3", outputStreamCaptor.toString().trim());

    }

    @DisplayName("Impresion: vd (vertical directa)")
    @Test
    void Fibonacci_Of_5_PrintMode_vd_Should_Print_Vertical_Direct() {

        // Given PrintMode: hi
        PrinterFactory printerFactory = new PrinterFactory();
        Printer printer = printerFactory.create("vd");

        // When Print Serie
        printer.print(serie, 5);

        // Then
        assertEquals("fibo<5>: \n0\n1\n2\n3", outputStreamCaptor.toString().trim());

    }

    @DisplayName("Impresion: vi (vertical invertido)")
    @Test
    void Fibonacci_Of_5_PrintMode_vd_Should_Print_Vertical_Reverse() {

        // Given PrintMode: hi
        PrinterFactory printerFactory = new PrinterFactory();
        Printer printer = printerFactory.create("vi");

        // When Print Serie
        printer.print(serie, 5);

        // Then
        assertEquals("fibo<5>: \n3\n2\n1\n0", outputStreamCaptor.toString().trim());

    }

}
