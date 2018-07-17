package pl.jangrot.algs;

public class EvenOrOdd {

    public static Boolean isListEven(ListNode head) {
        int i = 0;
        ListNode tmp = head;

        while (tmp != null) {
            i++;
            tmp = tmp.next;
        }
        return i % 2 == 0;
    }
}
