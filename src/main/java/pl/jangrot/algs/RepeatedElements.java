package pl.jangrot.algs;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RepeatedElements {

    /*
    Write a method duplicate to find the repeated or duplicate elements in an array.
    */
    public static Set<Integer> duplicate(int[] numbers) {
        TreeSet<Integer> duplicates = new TreeSet();
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                duplicates.add(numbers[i]);
            }
        }

        return duplicates;
    }
}
