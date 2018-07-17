package pl.jangrot.algs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class IterativeInorderTraversal {

    public static List<Integer> inorderItr(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        List<Integer> inInorder = new ArrayList<>();


        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            node = stack.pop();
            inInorder.add(node.data);

            node = node.right;
        }
        return inInorder;
    }
}
