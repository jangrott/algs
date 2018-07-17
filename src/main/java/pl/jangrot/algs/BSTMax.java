package pl.jangrot.algs;

public class BSTMax {

    /*
     Given a binary tree, write a recursive method to return the maximum element.
     */
    public static int findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(Math.max(root.data, findMax(root.left)), findMax(root.right));
    }
}
