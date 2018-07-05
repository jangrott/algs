package pl.jangrot.algs;

public class FindMissingNumber {

    /*
    Given an Array containing 9 numbers ranging from 1 to 10, write a method to find the missing number.
    Assume you have 9 numbers between 1 to 10 and only one number is missing.
     */
    public static int findMissingNumber(int[] arr) {
        int sum = 55;

        for (int i : arr) {
            sum -= i;
        }

        return sum;
    }
}
