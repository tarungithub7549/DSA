// Problem: Rotate Array
// Platform: LeetCode (189)
// Approach: Reverse entire array, then reverse first k elements, then reverse remaining elements.
// Time: O(n)
// Space: O(1)
// Key Idea: Rotation can be achieved using 3 reversals — efficient in-place transformation without extra space.


class Solution {
    public void rotate(int[] nums, int k) {
      int n = nums.length;
      k = k % n;

      reverse(nums , 0 , n-1);
      reverse(nums , 0 , k-1);
      reverse(nums , k , n-1);
    }
      private void reverse(int[] nums ,int start ,int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
      }
}