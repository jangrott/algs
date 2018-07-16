package pl.jangrot.algs;

import java.util.ArrayList;
import java.util.List;

public class RecursivePreorderTraversal {

    List<Integer> preorderedList = new ArrayList<>();

    public void preorder(TreeNode root) {
        if (root != null) {
            preorderedList.add(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
}
