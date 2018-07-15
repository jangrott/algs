package pl.jangrot.algs;

public class Pow {

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double r = n > 0 ? x : 1.0 / x;
        while (n-- > 1) {
            r *= x;
        }

        return r;
    }
}
