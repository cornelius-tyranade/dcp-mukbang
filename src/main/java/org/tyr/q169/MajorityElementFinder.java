package org.tyr.q169;

public class MajorityElementFinder {


    // Moore Voting Algorithm
    public static int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num: nums) {
            // If count equals 0, reset candidate to current number
            if (count == 0) {
                candidate = num;
            }

            // If num equals to candidate increase, do the opposite if not equals
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        System.out.println(findMajorityElement(new int[]{3, 2, 3}));
        System.out.println(findMajorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
