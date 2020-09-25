import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiboTests {


    @DisplayName("Fibonacci de 5 debe dar 3")
    @Test
    void Fibonacci_De_5_Should_Be_3() {
        Fibo fibo = new Fibo(5);
        assertEquals(3, fibo.calculate());
    }


    @DisplayName("Fibonacci de 8 debe dar 13")
    @Test
    void Fibonacci_De_8_Should_Be_13() {
        Fibo fibo = new Fibo(8);
        assertEquals(13, fibo.calculate());
    }

}
