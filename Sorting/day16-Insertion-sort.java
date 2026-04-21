// Problem: Insertion Sort
// Platform: take u forward
// Approach: Build sorted portion, one element at a time
// Time: Best = O(n), Average = O(n^2), Worst = O(n^2)
// Space: O(1)
// Key Idea: Pick current element, shift bigger left-side elements, insert in correct place

class Solution {
    public int[] insertionSort(int[] nums) {
        int n = nums.length;

    for (int i = 1; i < n; i++) {   // start from index 1 (index 0 is already "sorted")
        int key = nums[i];          // pick up this element — this is the card in your hand.(Storing it in temp. storage;)
        int j = i - 1;              // start comparing from the element just before it

        while (j >= 0 && nums[j] > key) {   // while left neighbour is bigger than key...
            nums[j + 1] = nums[j];          // shift that element one step to the right
            j--;                            // move one step further left
        }

        nums[j + 1] = key;                  // drop the key into the gap we created
    }
    return nums;
    }
}
