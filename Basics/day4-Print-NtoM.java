// Problem: Print numbers from n to count using recursion
// Platform: basic recursion
// Approach: Recursive (decrease n in each call until base case)
// Time: O(n - count)
// Space: O(n - count)  (due to recursion stack)
// Key Idea: print current number and recursively call for n-1 until n == count

class Solution{
    public static void printN(int n, int count){
        if(n == count){
            return;
        }
        // System.out.println(count);
        System.out.println(n);
        printN(n-1, count);
    }
}