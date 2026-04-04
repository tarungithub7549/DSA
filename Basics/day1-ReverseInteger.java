// Problem: Reverse Integer
// Platform: LeetCode
// Approach: Math (modulus + division)
// Time: O(log n)
// Space: O(1)
// Key Idea: extract digit and build reverse

class Solution {
    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }
}
