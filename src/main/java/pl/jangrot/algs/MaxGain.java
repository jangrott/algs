package pl.jangrot.algs;

public class MaxGain {

    public static int maxGain(int[] a) {
        int max = a[1] - a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] - min > max)
                max = a[i] - min;
            if (a[i] < min)
                min = a[i];
        }
        return max < 0 ? 0 : max;
    }
}
