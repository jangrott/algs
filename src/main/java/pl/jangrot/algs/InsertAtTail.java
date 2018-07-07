package pl.jangrot.algs;

public class InsertAtTail {

    public static ListNode insertAtTail(ListNode head, int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            return head;
        }

        ListNode tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node;
        return head;
    }
}
