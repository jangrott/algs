package pl.jangrot.algs;

public class BubbleSort {

    public static int[] bubbleSortArray(int[] arr) {
        int len = arr.length - 1, i = 0, cnt = 0;

        while (i < len) {
            if (arr[i] > arr[i + 1]) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                cnt++;
            }
            if (cnt > 0 && i + 1 == len) {
                cnt = 0;
                i = 0;
            } else {
                i++;
            }
        }
        return arr;
    }
}
