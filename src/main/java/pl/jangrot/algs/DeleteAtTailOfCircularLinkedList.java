package pl.jangrot.algs;

public class DeleteAtTailOfCircularLinkedList {

    public static ListNode deleteAtTail(ListNode head) {
        if (head == null || head.next == head) {
            return null;
        }

        ListNode tmp = head, prev = null;


        while (tmp.next != head) {
            prev = tmp;
            tmp = tmp.next;
        }
        prev.next = tmp.next;
        tmp.next = null;
        return head;
    }
}
