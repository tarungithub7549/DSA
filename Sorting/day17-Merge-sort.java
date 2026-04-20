// Problem: Merge Sort
// Platform: take u forward
// Approach: Divide and Conquer
// Time: O(n log n)
// Space: O(n)
// Key Idea: Divide array into halves, sort each half, then merge them


class Solution{
            // Main function — splits the array recursively
public void mergeSort(int[] arr, int left, int right) {
    if (left < right) {                        // base case: if 1 element, stop
        int mid = (left + right) / 2;          // find the middle

        mergeSort(arr, left, mid);             // sort left half (recursive call)
        mergeSort(arr, mid + 1, right);        // sort right half (recursive call)

        merge(arr, left, mid, right);          // merge the two sorted halves
    }
}

// Merge function — combines two sorted halves into one sorted piece
public void merge(int[] arr, int left, int mid, int right) {
    int[] leftArr  = Arrays.copyOfRange(arr, left, mid + 1);
    int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);

    int i = 0, j = 0, k = left;              // i = left pointer, j = right pointer

    while (i < leftArr.length && j < rightArr.length) {
        if (leftArr[i] <= rightArr[j]) {
            arr[k++] = leftArr[i++];          // left element is smaller, pick it
        } else {
            arr[k++] = rightArr[j++];         // right element is smaller, pick it
        }
    }

    // copy any remaining elements
    while (i < leftArr.length)  arr[k++] = leftArr[i++];
    while (j < rightArr.length) arr[k++] = rightArr[j++];
}
}