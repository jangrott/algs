package pl.jangrot.algs;

public class SelectionSort {

    public static int[] selectionSortArray(int[] arr) {
        int h;
        for (int i = 0; i < arr.length; i++) {
            h = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[h]) {
                    h = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[h];
            arr[h] = t;
        }
        return arr;
    }
}
