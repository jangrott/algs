package pl.jangrot.algs;

public class DeleteAtHeadOfCircularLinkedList {

    public static ListNode deleteAtHead(ListNode head) {
        if (head == null || head == head.next) {
            return null;
        }
        ListNode last = head;

        while (last.next != head) {
            last = last.next;
        }

        last.next = head.next;
        head.next = null;
        head = last.next;

        return head;
    }
}
