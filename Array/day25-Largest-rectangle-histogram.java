// Problem: Largest rectangle in histogram
// Platform: Neetcode
// Approach: using stack
// Time: O(1)
// Space: O(n)
// Key Idea: we use stack to store heithts, until height less than top of stack occurs , then we calculate maxarea;

import java.util.*;
class Solution{
    public int largestRectangleArea(int[] heights){

        Deque<Integer> stack = new ArrayDeque<>();
        int len = heights.length;
        int maxarea = 0;

        for(int i = 0; i < len; i++){
            int currentheight = heights[i];
            while(!stack.isEmpty() && currentheight < heights[stack.peek()]){

                int hight = heights[stack.pop()];
                int width;

                if(stack.isEmpty()){
                    width = i;
                }
                else{
                    width = i - stack.peek() - 1;
                }
                maxarea = Math.max(maxarea, hight*width);
            }
            stack.push(i);
        }
        return maxarea;
    }
}