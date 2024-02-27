package org.tyr.q217;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChecker {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();

        // Check if hashset contains number, if not add to hashset
        for (int num : nums) {
            if (hs.contains(num)) {
                return true;
            }
            hs.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}
