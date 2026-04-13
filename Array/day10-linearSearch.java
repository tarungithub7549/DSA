// Problem: Linear Search
// Platform: take u forward
// Approach: Traverse array from start and compare each element with target.
// Time: O(n)
// Space: O(1)
// Key Idea: Check each element sequentially until target is found or array ends.

class Solution {
    public int linearSearch(int nums[], int target) {
		//Your code goes here
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) return i;
        }
        return -1;
    }
}