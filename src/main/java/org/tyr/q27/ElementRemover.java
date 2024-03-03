package org.tyr.q27;

import java.util.Arrays;

public class ElementRemover {

    public static int removeElement(int[] nums, int val) {
        // Filter existing array to new array
        int[] newNums = Arrays.stream(nums).filter(i -> i != val).toArray();

        // Copy value new array to existing array
        System.arraycopy(newNums, 0, nums, 0, newNums.length);

        return newNums.length;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}
