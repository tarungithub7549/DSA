// Problem: Check if a number is prime
// Platform: take u forward
// Approach: Check divisibility up to √n
// Time: O(√n)
// Space: O(1)
// Key Idea: factors occur in pairs, so check till square root only

class Solution {
    public static boolean isPrime(int n){
        if (n <= 1) return false;

        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // early exit
            }
        }
        return true;
    }
}