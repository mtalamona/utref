import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiboTests {


    @DisplayName("Fibonacci de 5 debe dar 8")
    @Test
    void Fibonacci_De_5_Should_Be_5() {
        Fibo fibo = new Fibo(5);
        assertEquals(5, fibo.calcularSerie());
    }


    @DisplayName("Fibonacci de 8 debe dar 21")
    @Test
    void Fibonacci_De_8_Should_Be_21() {
        Fibo fibo = new Fibo(8);
        assertEquals(21, fibo.calcularSerie());
    }

}
