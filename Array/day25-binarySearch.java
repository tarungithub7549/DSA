// Problem: finding target value in array
// Platform: Neetcode
// Approach: Binary search
// Time: O(logn)
// Space: O(1)
// Key Idea: we use binary search to decrease the time complexity

class Solution{
    public int Search(int[] nums, int target){

        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int mid = l + (r - l)/2;

            if(nums[mid] == target) return mid;

            else if(nums[mid] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return -1;
    }
}