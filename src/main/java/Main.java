public class Main {

    public static void main(String[] args){
        // System.out.println(Fibonacci.nthFibonacciTerm(8));

        int serieArgument;

        // If no args provided, set 8
        if (args.length == 0) {
            serieArgument = 5;
        } else {
            serieArgument = Integer.parseInt(args[0]);
        }

        try {
            Fibo fibo = new Fibo(serieArgument);
            String serieFibonacci = fibo.calculate();
            System.out.println("Fibo<" + serieArgument + ">: " + serieFibonacci);
        } catch (Exception e) {
            System.out.println("x El número ingresado es inválido. Verificar que no sea menor que cero.");
        }

    }

}
