package pl.jangrot.algs;

public class DeleteAtHead {

    /*
    Given a singly-linked list, write a method to delete the first node of the list and return the new head.
     */
    public static ListNode deleteAtHead(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode t = head.next;
        head.next = null;
        head = t;
        return head;
    }
}
