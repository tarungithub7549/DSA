// Problem: Check if Array is Sorted and Rotated
// Platform: LeetCode (1752)
// Approach: Traverse array and count number of order breaks using circular comparison (i+1)%n.
// Time: O(n)
// Space: O(1)
// Key Idea: A sorted and rotated array can have at most one drop point (nums[i] > nums[i+1]).

class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        if(len <= 1) return true;
        int count = 0;

        for(int i = 0; i < len; i++){
            if(nums[i] > nums[(i+1) % len]){
                count++;
            }
            if(count > 1)return false;
        }

        return true;
    }
}