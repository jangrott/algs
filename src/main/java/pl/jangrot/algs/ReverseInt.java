package pl.jangrot.algs;

public class ReverseInt {

    public static int reverseInt(int x) {
        boolean isNegative = false;

        if (x < 0) {
            x *= -1;
            isNegative = true;
        }

        int reversed = 0;

        while (x > 0) {
            reversed *= 10;
            reversed += (x % 10);
            x /= 10;
        }

        return isNegative ? -1 * reversed : reversed;
    }
}
