// Problem: Single Number
// Platform: LeetCode (136)
// Approach: Use XOR to cancel out duplicate elements.
// Time: O(n)
// Space: O(1)
// Key Idea: XOR of same numbers = 0, so only unique number remains.


class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;

        for(int num : nums){
            xor = xor ^ num;
        }
        return xor;
    }
}