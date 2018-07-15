package pl.jangrot.algs;

public class MergeTwoSortedArrays {

    public static int[] merge(int[] arrLeft, int[] arrRight) {
        int leftLength = arrLeft.length;
        int rightLength = arrRight.length;
        int outputLength = leftLength + rightLength;
        int[] output = new int[outputLength];

        int lIndex = 0, rIndex = 0;

        for (int i = 0; i < outputLength; i++) {
            if (leftLength > lIndex && rightLength > rIndex) {
                if (arrLeft[lIndex] < arrRight[rIndex]) {
                    output[i] = arrLeft[lIndex++];
                } else {
                    output[i] = arrRight[rIndex++];
                }
            } else if (leftLength > lIndex) {
                output[i] = arrLeft[lIndex++];
            } else if (rightLength > rIndex) {
                output[i] = arrRight[rIndex++];
            }
        }

        return output;
    }
}
