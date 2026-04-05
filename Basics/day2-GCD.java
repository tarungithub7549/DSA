// Problem: Find GCD (Greatest Common Divisor) of two numbers
// Platform: take u forward
// Approach: Brute Force (check all numbers from 1 to min(n, m))
// Time: O(min(n, m))
// Space: O(1)
// Key Idea: iterate from 1 to min(n, m) and find the largest number that divides both

class Solution {
    public static int gcd(int n, int m){
        int ans = 0;
        for (int i = 1; i <= Math.min(n , m); i++) {
            if(n % i == 0 && m % i == 0){
                ans = i;
            }
        }
        return ans;
    }
}