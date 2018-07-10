package pl.jangrot.algs;

import java.util.List;

public class ListNodeUtils {

    public static ListNode toListNode(List<Integer> items) {
        return toListNode(items, false);
    }

    public static ListNode toListNode(List<Integer> items, boolean isCircular) {
        ListNode node = null, rootNode = null, lastNode = null;

        for (int item : items) {
            if (node == null) {
                node = new ListNode(item);
                if (rootNode == null) {
                    rootNode = node;
                }
                if (lastNode != null) {
                    lastNode.next = node;
                }
            }
            lastNode = node;
            node = node.next;
        }
        if (isCircular) {
            lastNode.next = rootNode;
        }
        return rootNode;
    }
}
