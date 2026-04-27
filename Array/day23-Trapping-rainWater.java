// Problem: Trapping rain water
// Platform: Neetcode
// Approach: Two pointer
// Time: O(n)
// Space: O(1)
// Key Idea: we use two pointers to find maximum height of poles , and them calculate water trapped betweem them;

class Solution{
    public int trap(int[] height){
        int l = 0;
        int r = height.length - 1;
        int leftmax = 0;
        int rightmax = 0;
        int water = 0;

        while(l < r){
            if(height[l] < height[r]){
                if(height[l] >= leftmax){
                    leftmax = height[l];
                }
                else{
                    water += leftmax - height[l];
                }
                l++;
            }
            else{
                if(height[r] >= rightmax){
                    rightmax = height[r];
                }
                else{
                    water += rightmax - height[r];
                }
                r--;
            }
        }
        return water;
    }
}