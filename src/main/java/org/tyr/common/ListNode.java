package org.tyr.common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        ListNode pointer = this;

        while (pointer != null) {
            System.out.print(pointer.val);
            pointer = pointer.next;
        }
        System.out.println();
    }
}
