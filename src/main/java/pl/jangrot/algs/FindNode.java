package pl.jangrot.algs;

import java.util.LinkedList;
import java.util.Queue;

public class FindNode {

    /*
    Given a binary tree, write a method to find and return the node with data = the input data. Do not use recursion.
     */
    public static TreeNode findNode(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node.data == val) {
                return node;
            }

            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
        }
        return null;
    }
}
