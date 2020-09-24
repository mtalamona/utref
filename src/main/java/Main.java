public class Main {

    public static void main(String[] args){
        // System.out.println(Fibonacci.nthFibonacciTerm(8));

        int numero = Integer.parseInt(args[0]);

        System.out.println("Número ingresado: " + numero);

        try {
            Fibo fibo = new Fibo(numer
            int cant = fibo.calcularSerie();
            System.out.println("Serie Fibonacci: " + cant);
        } catch (Exception e) {
            System.out.println("El número ingresado es inválido. Verificar que no sea menor que cero.");
        }

    }

}
