package pl.jangrot.algs;

public class DeleteAtTail {

    public static ListNode deleteAtTail(ListNode head) {
        if (head == null || head.next == null) {
            head = null;
            return head;
        }

        ListNode tmp = head;

        while(tmp.next.next != null) {
            tmp = tmp.next;
        }
        tmp.next = null;
        return head;
    }
}
