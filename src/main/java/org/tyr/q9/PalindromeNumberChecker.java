package org.tyr.q9;

public class PalindromeNumberChecker {
    public static boolean isPalindromeOriginal(int x) {
        // Exclude minus number
        if (x < 0) return false;

        // Best practice to not direct update method parameter value
        int tempForMod = x;
        int tempForDiv = x;

        // Count number length without convert to String
        int l = (int) (Math.log10(x) + 1);
        int mid = l / 2;

        // Variable for power iteration to get front digit
        int p = l - 1;

        for (int i = 1; i <= mid; i++) {
            // Get front digit
            int pDiv = (int) Math.pow(10, p);
            int divResult = tempForDiv / pDiv % 10;
            p--;

            // Get back digit
            int modResult = tempForMod % 10;
            tempForMod /= 10;

            // Compare value between front and back digit
            if (divResult != modResult) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int x) {
        // Exclude minus and if x has last digit 0
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        // Define temp variables for reverse number
        int original = x;
        int reversed = 0;


        while (original > reversed) {
            reversed = reversed * 10 + original % 10;
            original /= 10;
        }

        return (original == reversed) || (original == reversed / 10);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(9999));
        System.out.println(isPalindrome(1001));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
