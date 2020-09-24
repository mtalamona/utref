public class Fibonacci {

    public Fibonacci() {}

        public static int nthFibonacciTerm(int n) {
            if (n == 1 || n == 0) {
                return n;
            }
            return nthFibonacciTerm(n-1) + nthFibonacciTerm(n-2);
        }
}
