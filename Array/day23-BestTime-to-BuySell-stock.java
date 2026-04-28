// Problem: Best time to buy and sell stock 
// Platform: Neetcode
// Approach: Two pointer
// Time: O(n)
// Space: O(1)
// Key Idea:  Keep track of cheapest buy price so far, and update max profit while scanning once.

class Solution{
    public int maxProfit(int[] prices){

        int buy = prices[0];
        int maxp = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else{
                maxp = Math.max(maxp, prices[i] - buy);
            }
        }
        return maxp;
    }
}