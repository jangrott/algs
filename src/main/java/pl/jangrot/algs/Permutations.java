package pl.jangrot.algs;

import java.util.Arrays;

public class Permutations {

    public static boolean permutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freqStr1 = new int[256];
        int[] freqStr2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            freqStr1[str1.charAt(i)] += 1;
            freqStr2[str2.charAt(i)] += 1;
        }

        return Arrays.equals(freqStr1, freqStr2);
    }
}
