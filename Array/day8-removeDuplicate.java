// Problem: Remove Duplicates from Sorted Array
// Platform: LeetCode (26)
// Approach: Use two pointers — one (i) to traverse, another (k) to place unique elements.
// Time: O(n)
// Space: O(1)
// Key Idea: Since array is sorted, duplicates are adjacent — compare with previous element and overwrite in-place.

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        if(nums.length == 0) return 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[i-1])
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}