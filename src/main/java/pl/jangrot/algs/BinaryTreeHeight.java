package pl.jangrot.algs;

public class BinaryTreeHeight {

    public static int findHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lHeight = findHeight(root.left);
        int rHeight = findHeight(root.right);

        if (lHeight > rHeight) {
            return lHeight + 1;
        } else {
            return rHeight + 1;
        }
    }
}
