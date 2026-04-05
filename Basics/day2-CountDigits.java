// Problem: Count Digits in a Number
// Platform: Take u forward
// Approach: Math (division by 10)
// Time: O(log n)
// Space: O(1)
// Key Idea: repeatedly divide number by 10 and count how many times it becomes 0

class Solution {
    public int countDigit(int n) {
        if(n == 0) return 1;

        int count = 0;

        while(n > 0){
            count++;
            n = n / 10;
        }

        return count;
    }
}