// Problem: Longest substring without repeating
// Platform: Neetcode
// Approach: use hashmap to find repeating character
// Time: O(n)
// Space: O(n)
// Key Idea: use hashmap to find upcoming duplicate, and move L;

import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int l = 0;
        int maxLen = 0;

        for (int r = 0; r < s.length(); r++) {

            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(r));

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}