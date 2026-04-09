// Problem: Check if a string is a palindrome
// Platform: leetcode
// Approach: Compare characters from start and end recursively
// Time: O(n)
// Space: O(n)  (due to recursion stack)
// Key Idea: compare s[i] with s[n-i-1] and move inward until middle

class Solution{
    public static boolean checkPalindrom(String s, int i){

        if (s.length()==1) {
            return true;
        }
        if (i >= s.length()/2) {
            return true;
        }
        if (s.toLowerCase().charAt(i) != s.toLowerCase().charAt(s.length()-i-1)) {
            return false;
        }
        return checkPalindrom(s, i+1);
    }
}