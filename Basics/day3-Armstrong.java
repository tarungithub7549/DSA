// Problem: Check if a number is an Armstrong number
// Platform: take u forward
// Approach: Extract digits and compute sum of (digit ^ number of digits)
// Time: O(d) ≈ O(log n)   (d = number of digits)
// Space: O(d)
// Key Idea: if sum of (each digit raised to power of total digits) equals original number, it's Armstrong



class Solution {
    public static boolean checkArm(int n){
        int len = (Integer.toString(n)).length();
        int ans = 0;
        int k = n;

        for (int i = 0; i < len; i++) {
            ans += (int)Math.pow(n % 10, len); // FIXED
            n = n / 10;
        }
        return k == ans;
    }
}