package org.tyr.q26;

import java.util.Arrays;

public class DuplicateRemover {

    public static int removeDuplicatesOriginal(int[] nums) {
        // Remove duplicate values
        int[] newNums = Arrays.stream(nums).distinct().toArray();

        // Copy value new array to existing array
        System.arraycopy(newNums, 0, nums, 0, newNums.length);

        return newNums.length;
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            // Since array is sorted, replace current array value with previous value if not same
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
