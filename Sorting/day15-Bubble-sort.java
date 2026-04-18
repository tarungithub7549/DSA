// Problem: Bubble Sort
// Platform: take u forward
// Approach: compare adjusent element and swap them if left one is larger otherwise not
// Time: O(n^2)
// Space: O(1)
// Key Idea: Largest element "bubbles up" to the end each pass

class Solution {
    public int[] bubbleSort(int[] nums) {

        int n = nums.length;
        boolean swap = false;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
        return nums;
    }
}