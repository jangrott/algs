package pl.jangrot.algs;

public class FibonacciNumber {

    public static int fib(int n) {
        if (n < 2) {
            return n;
        }
        int prev = 1, fib = 1, temp;
        for (int i = 2; i < n; i++) {
            temp = prev;
            prev = fib;
            fib += temp;
        }

        return fib;
    }
}
