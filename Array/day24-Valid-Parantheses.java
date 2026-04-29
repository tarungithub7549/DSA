// Problem: Valid parentheses
// Platform: Neetcode
// Approach: using Stack
// Time: O(1)
// Space: O(1)
// Key Idea: we use stack to store open brackets and then pop brackets when a close bracket come,
// and at we check , the stack is empty or not

import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(c == ')' && top != '(') return false; 
                if(c == ']' && top != '[') return false; 
                if(c == '}' && top != '{') return false; 
            }
        }
        return stack.isEmpty();
    }
}