package pl.jangrot.algs;

public class VerticalFlip {

    /*
    You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its vertical axis.
     */
    public static int[][] flipItVerticalAxis(int[][] matrix) {
        int tmp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
                matrix[i][matrix[i].length - 1 - j] = tmp;
            }
        }
        return matrix;
    }
}
