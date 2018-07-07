package pl.jangrot.algs;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    /*
    Write a method that returns a number that appears only once in an array.
Assume the array will surely have a unique value. The array will never be empty.
     */
    public static int singleNumber(int[] A) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i : A) {
            freq.merge(i, 1, (a, b) -> a + b);
        }

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }

        return -1;
    }
}