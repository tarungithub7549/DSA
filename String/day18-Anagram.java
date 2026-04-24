// Problem: Valid Anagram
// Platform: Neetcode / Leetcode
// Approach: Convert strings to char arrays, sort both, compare arrays
// Time Complexity: O(n log n)
// Space Complexity: O(n)
// Key Idea: Anagrams have same characters in sorted order

import java.util.*;
class Solution{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar , tChar);    
    }
}