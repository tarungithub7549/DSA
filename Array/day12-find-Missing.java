// Problem: Find Missing Number
// Platform: TUF / LeetCode (268)
// Approach: Use Sum Formula
// Time: O(n)
// Space: O(1)
// Key Idea: Expected sum - actual sum = missing number

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}