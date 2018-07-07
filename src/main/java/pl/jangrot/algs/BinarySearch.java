package pl.jangrot.algs;

public class BinarySearch {

    public static Boolean binarySearch(int[] arr, int n) {
        int start = 0, end = arr.length - 1, mid;

        while (end >= start) {
            mid = (start + end) / 2;
            if (arr[mid] == n) {
                return true;
            } else if (arr[mid] > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}
