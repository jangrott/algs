package pl.jangrot.algs;

public class InsertIntoBST {

    public static TreeNode insert(TreeNode root, int data) {

        if (root == null) {
            return new TreeNode(data);
        }

        if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }
}
