package org.tyr.q53;

public class MaximumSubarrayFinder {

    // Kadane's Algorithm
    public static int maxSubArray(int[] nums) {
        // Set default maxSum
        int maxSum = nums[0];
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            // If currentSum value less than zero, reset currentSum to zero
            if (currentSum < 0) currentSum = 0;

            // Add currentSum with current number value
            currentSum += nums[i];

            // Compare between maxSum and currentSum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray(new int[]{-1, -2}));
        System.out.println(maxSubArray(new int[]{-2, 1}));
        System.out.println(maxSubArray(new int[]{1}));
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
