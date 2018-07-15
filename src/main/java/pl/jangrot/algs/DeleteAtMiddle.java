package pl.jangrot.algs;

public class DeleteAtMiddle {

    public static ListNode deleteAtMiddle(ListNode head, int position) {
        if (head == null) {
            return null;
        } else if (position == 1) {
            return head.next;
        }

        ListNode curr = head.next;
        ListNode prev = head;
        int idx = 2;

        do {
            if (idx == position) {
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr = curr.next;
        } while (idx++ <= position && curr != null);

        return head;
    }
}
