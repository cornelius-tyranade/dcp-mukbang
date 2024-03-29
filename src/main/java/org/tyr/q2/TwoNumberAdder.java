package org.tyr.q2;

import org.tyr.common.ListNode;

import java.math.BigInteger;

public class TwoNumberAdder {

    public static ListNode addTwoNumbersOriginal(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();

        // Get ListNode l1 full value
        ListNode p1 = l1;
        BigInteger val1 = BigInteger.ZERO;
        BigInteger power1 = BigInteger.ONE;

        while (p1 != null) {
            val1 =  BigInteger.valueOf(p1.val).multiply(power1).add(val1);
            power1 = power1.multiply(BigInteger.valueOf(10));
            p1 = p1.next;
        }

        // Get ListNode l2 full value
        ListNode p2 = l2;
        BigInteger val2 = BigInteger.ZERO;
        BigInteger power2 = BigInteger.ONE;

        while (p2 != null) {
            val2 =  BigInteger.valueOf(p2.val).multiply(power2).add(val2);
            power2 = power2.multiply(BigInteger.valueOf(10));
            p2 = p2.next;
        }

        // Sum between ListNode l1 and ListNode l2
        BigInteger sumVal = val1.add(val2);

        // Convert sumVal to ListNode result
        boolean first = true;
        ListNode p3 = new ListNode();

        while (sumVal.compareTo(BigInteger.ZERO) > 0) {
            BigInteger modVal = sumVal.mod(BigInteger.valueOf(10));

            if (first) {
                result = new ListNode(modVal.intValue());
                p3 = result;
                first = false;
            } else {
                p3.next = new ListNode(modVal.intValue());
                p3 = p3.next;
            }
            sumVal = sumVal.divide(BigInteger.valueOf(10));
        }

        return result;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        // Iterate as long as l1 and l2 has value or carry is not 0
        while (l1 != null || l2 != null || carry != 0) {
            // Get l1 and l2 value
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            // Sum digit 1 and digit 2 and get carry
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            // Add new node
            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            // Get next list node
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        // Return by skipping first head
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode ls11 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode ls12 = new ListNode(5, new ListNode(6, new ListNode(4)));
        addTwoNumbers(ls11, ls12).print();

        ListNode ls21 = new ListNode(0);
        ListNode ls22 = new ListNode(0);
        addTwoNumbers(ls21, ls22).print();

        ListNode ls31 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode ls32 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        addTwoNumbers(ls31, ls32).print();

        ListNode ls41 = new ListNode(9, new ListNode(9));
        ListNode ls42 = new ListNode(9);
        addTwoNumbers(ls41, ls42).print();

        ListNode ls51 = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode ls52 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));
        addTwoNumbers(ls51, ls52).print();
    }
}
