package pl.jangrot.algs;

import java.util.Objects;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;

        ListNode head = this;
        do {
            if (head.data != listNode.data) {
                return false;
            }
            listNode = listNode.next;
        } while ((head = head.next) != null && head != this);
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    @Override
    public String toString() {
        ListNode head = this;
        StringBuilder sb = new StringBuilder();

        do {
            sb.append(head.data).append("->");
        } while ((head = head.next) != null && head != this);

        return sb.substring(0, sb.length() - 2);
    }
}