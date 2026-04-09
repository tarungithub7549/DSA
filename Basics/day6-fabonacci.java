// Problem: Find nth Fibonacci number
// Platform: leetcode
// Approach: Recursive (f(n) = f(n-1) + f(n-2))
// Time: O(2^n)
// Space: O(n)  (due to recursion stack)
// Key Idea: break problem into two recursive calls for each n

class Solution{
    public static int printfinobacci(int n){
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
       
        return printfinobacci(n-1) + printfinobacci(n-2);
   }
}