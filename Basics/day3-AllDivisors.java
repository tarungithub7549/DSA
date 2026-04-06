// Problem: Find all divisors of a number
// Platform: take u forward / basic math
// Approach: Brute Force (check every number from 1 to n)
// Time: O(√n)
// Space: O(k)
// Key Idea: iterate till √n and add both divisor pairs

import java.util.*;
class Solution  {
    public static List<Integer> divisors(int n){
        List<Integer> ans = new ArrayList<>();
    
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ans.add(i);
                
                if (i != n / i) {
                    ans.add(n / i);
                }
            }
        }
        return ans;
    }
}
