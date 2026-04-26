// Problem: Group Anagram
// Platform: Neetcode
// Approach: using HashMap and list
// Time: O(n * (m logm))
// Space: O(n * m)
// Key Idea: convert each string into array , sort them, so that every anagram string looks same , and 
// then add them to ArrayList;

import java.util.*;
class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> res = new HashMap<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}