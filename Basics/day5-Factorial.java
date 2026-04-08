// Problem: Find factorial of a number
// Platform: take u forward
// Approach: Recursive (multiply n with factorial(n-1))
// Time: O(n)
// Space: O(n)  (due to recursion stack)
// Key Idea: factorial(n) = n * factorial(n-1) with base case factorial(0 or 1) = 1

class Solution{
    public static int factorial(int n){
        if (n == 1 || n < 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
} 