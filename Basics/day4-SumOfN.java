// Problem: Find sum of first n natural numbers
// Platform: take u forward
// Approach: Recursive (reduce problem by adding n + sum(n-1))
// Time: O(n)
// Space: O(n)  (due to recursion stack)
// Key Idea: sum(n) = n + sum(n-1) with base case sum(1) = 1


class Solution{
    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        return n + Sum(n-1);
    }
}
