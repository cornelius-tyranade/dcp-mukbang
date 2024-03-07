package org.tyr.q13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToIntegerConverter {

    public static int convertRomanToIntOriginal(String s) {
        // Set pair of roman and integer
        Map<Character, Integer> hs = new HashMap<>();
        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);

        int p = s.length() - 1;
        int r = 0;

        // Loop from back
        while (p >= 0) {
            char item1 = s.charAt(p);
            int itemVal1 = hs.get(item1);
            r += itemVal1;

            if (p != 0) {
                char item2 = s.charAt(p - 1);
                int itemVal2 = hs.get(item2);

                // Check if the next roman value is less than current one
                if (itemVal2 < itemVal1) {
                    r -= itemVal2;

                    // Skip current pointer
                    p--;
                }
            }
            p--;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(convertRomanToIntOriginal("III"));
        System.out.println(convertRomanToIntOriginal("LVIII"));
        System.out.println(convertRomanToIntOriginal("MCMXCIV"));
    }
}
