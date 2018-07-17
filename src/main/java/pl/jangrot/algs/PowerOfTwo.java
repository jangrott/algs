package pl.jangrot.algs;

public class PowerOfTwo {

    public static boolean isPowOfTwo(int num) {
        return (num & (num - 1)) == 0;
    }
}
