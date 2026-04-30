// Problem: find minimun in rotated sorted array
// Platform: Neetcode
// Approach: binary search
// Time: O(logn)
// Space: O(1)
// Key Idea: we use binary search for O(logn) time complexity, we can also use for loop which gives O(n) time complexity;


class Solution{
    public int findMin(int[] nums){
        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            int mid = l + (r - l)/2;

            if(nums[mid] > nums[r]){
                 l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return nums[l];
    }
}

//-----------------------------------------------

// class Solution {
//     public int findMin(int[] nums) {
//         int min = nums[0];

//         for(int i = 1; i < nums.length; i++){

//             if(nums[i] < min){
//                 min = nums[i];
//             }
//         }
//         return min;
//     }
// }
