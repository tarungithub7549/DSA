// Problem: Palindrome Number
// Approach: Math (reverse half using modulus + division)
// Time: O(log n)
// Space: O(1)
// Key Idea: reverse only half of the number and compare both halves
// Key Idea: x == rev (even length) OR x == rev/10 (odd length)

class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0 || (x % 10 == 0 && x != 0)) return false;

        int rev = 0;

        while(x > rev){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

        return x == rev || x == rev / 10;
    }
}