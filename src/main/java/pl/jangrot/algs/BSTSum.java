package pl.jangrot.algs;

public class BSTSum {

    public static int sum(TreeNode root) {
        if (root != null) {
            return root.data + sum(root.left) + sum(root.right);
        }
        return 0;
    }
}
