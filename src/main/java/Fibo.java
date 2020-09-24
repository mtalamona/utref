public class Fibo {

    int t1, t2, size;

    // Valido en el constuctor
    public Fibo (int n) {
        if (n < 0) throw new IllegalArgumentException("No se aceptan números negativos");
        this.size = n;
        this.t1 = 0;
        this.t2 = 1;
    }

    // Calcular serie
    public int calcularSerie() {

        int sum = 0;
        for (int i = 1; i <= size-1; ++i) {
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        return sum;
    }

}