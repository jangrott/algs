package pl.jangrot.algs;

public class InsertAtHead {

    public static ListNode insertAtHead(ListNode head, int data) {
        ListNode node = new ListNode(data);

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }

        return head;
    }
}