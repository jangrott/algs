package pl.jangrot.algs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class IterativePreorderTraversal {

    public static List<Integer> preorderItr(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> inPreorder = new ArrayList();

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);


        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            inPreorder.add(node.data);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return inPreorder;
    }
}
