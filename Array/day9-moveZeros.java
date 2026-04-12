// Problem: Move Zeroes
// Platform: LeetCode (283)
// Approach: Use two pointers — traverse array and swap non-zero elements to the front while maintaining order.
// Time: O(n)
// Space: O(1)
// Key Idea: Maintain a pointer (j) for next non-zero position and swap whenever a non-zero element is found.

class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int j = 0;

        for(int i = 0; i < len; i++){

            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] =  nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }
}
