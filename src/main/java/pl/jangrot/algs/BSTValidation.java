package pl.jangrot.algs;

public class BSTValidation {

    public static boolean validateBST(TreeNode root) {
        return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean validateBST(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        } else if (root.data < min || root.data > max) {
            return false;
        }

        return validateBST(root.left, min, root.data) && validateBST(root.right, root.data, max);
    }
}
