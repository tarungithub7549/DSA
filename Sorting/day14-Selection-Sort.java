// Problem: Selection sort
// Platform: take u forward
// Approach: Selection sort
// Time: O(n^2)    // Nested for loop;
// Space: O(1)     // fix one variable is used temp, NO matter how large the array is;
// Key Idea: Selection eack element and comparing it to all to find minimum, so that to place it at first position;


class Solution {
    public int[] selectionSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            int min = i;
            for(int j = i; j < nums.length; j++){
                if(nums[j] < nums[min]) min = j;
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return nums;
    }
}