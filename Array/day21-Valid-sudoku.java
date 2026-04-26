// Problem: sudoku is valid or not;
// Platform: Neetcode
// Approach: Use Hashset for checking dublicate
// Time: O(1)
// Space: O(1)
// Key Idea: we use HashSet to check for dublicate value

import java.util.*;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                char num = board[r][c];
                if(num == '.') continue;
                if(!set.add(num + "row" + r) ||
                 (!set.add(num + "column" + c)) ||
                 (!set.add(num + "box" + (r/3) + '-' + (c/3)))) return false;
            }
        }
        return true;
    }
}
