// Problem: Daily Temperature
// Platform: Neetcode
// Approach: using Stack
// Time: O(1)
// Space: O(1)
// Key Idea: we use stack to store index of temperatures, then we find the index of temperature greter than today

import java.util.*;
class Solution{
    public int[] dailyTemperatures(int[] temperatures){
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
        
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){

                int idx = stack.pop();
                res[idx] = i - idx;
            }
            stack.push(i);
        }
        return res;
    }
}