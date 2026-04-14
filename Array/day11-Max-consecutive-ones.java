// Problem: Max Consecutive Ones
// Platform: LeetCode (485)
// Approach: Traverse array and count consecutive 1s, reset on 0.
// Time: O(n)
// Space: O(1)
// Key Idea: Maintain a running count of 1s and track maximum streak.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for(int num: nums){
            if(num == 1){
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else{
                count = 0;
            }
        }
        return maxCount;
    }
}