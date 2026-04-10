// Problem: Find the largest element in an array
// Platform: take u forward
// Approach: Traverse entire array and track maximum value
// Time: O(n)
// Space: O(1)
// Key Idea: initialize max with smallest value and update while traversing

class Solution{
    public static int printLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        if (arr.length == 0) {return -1;}

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
