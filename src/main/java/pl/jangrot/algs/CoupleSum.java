package pl.jangrot.algs;

import java.util.HashMap;
import java.util.Map;

public class CoupleSum {

    /*
    Given an array of integers, find two numbers such that they sum up to a specific target.
    The method coupleSum should return the indices of the two numbers in the array, where index1 must be less than index2.
    Please note that the indices are not zero based, and you can assume that each input has exactly one solution.
     */
    public static int[] coupleSum(int[] numbers, int target) {
        Map<Integer, Integer> positions = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (positions.containsKey(numbers[i])) {
                int a = positions.get(numbers[i]);
                int b = i + 1;
                return a < b ? new int[]{a, b} : new int[]{b, a};
            }
            positions.put(target - numbers[i], i + 1);
        }

        throw new IllegalStateException();
    }
}