package org.tyr.q1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumChecker {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmComplement = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complementVal = target - nums[i];

            if (hmComplement.containsKey(complementVal)) {
                return new int[]{hmComplement.get(complementVal), i};
            }
            hmComplement.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }
}
