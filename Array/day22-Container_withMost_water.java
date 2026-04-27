// Problem: Container with most water
// Platform: Neetcode
// Approach: using two pointer
// Time: O(n);
// Space: O(1)
// Key Idea: using two pointer to find maximum area = width * height;

class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxwater = 0;

        while(l < r){
            int width = r - l;
            int height = Math.min(heights[l], heights[r]);
            int area = width * height;

            maxwater = Math.max(maxwater, area); 
            if(heights[l] < heights[r]) {l++;}
            else{r--;}
        }
        return maxwater;
    }
}
