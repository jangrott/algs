package pl.jangrot.algs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNodeUtils {

    public static TreeNode toTreeNode(List<Integer> items) {
        if (items == null || items.isEmpty()) {
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(items.get(0));
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i < items.size()) {
            TreeNode currentNode = q.poll();
            currentNode.left = new TreeNode(items.get(i++));
            q.add(currentNode.left);
            if (i < items.size()) {
                currentNode.right = new TreeNode(items.get(i++));
                q.add(currentNode.right);
            }
        }
        return root;
    }
}
