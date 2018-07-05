package pl.jangrot.algs;

public class HorizontalFlip {

    /*
    You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its horizontal axis.
     */
    public static int[][] flipHorizontalAxis(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            int[] j = matrix[i];
            matrix[i] = matrix[matrix.length - 1 - i];
            matrix[matrix.length - 1 - i] = j;
        }

        return matrix;
    }
}
