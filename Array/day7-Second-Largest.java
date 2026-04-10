// Problem: Find the second largest element in an array
// Platform: take u forward
// Approach: Traverse entire array and track maximum and second maximum value.
// Time: O(n)
// Space: O(1)
// Key Idea: initialize max and second max with smallest value and update while traversing

class Solution{
    public static int SLargest(int[] arr){

        if (arr.length < 2) { return -1;   }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        // Arrays.sort(arr); // sorting take more time O(nlogn) while this takes O(n).

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] != largest) { 
                secondlargest = arr[i];
            }
        }
        if(secondlargest == Integer.MIN_VALUE) return -1;
        return secondlargest;
    }
}
