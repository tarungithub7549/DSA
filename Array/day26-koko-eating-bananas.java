// Problem: Koko eating bananas
// Platform: Neetcode
// Approach: we use Binary search on maximum bananas to 1;
// Time: O(log n)
// Space: O(1)
// Key Idea: we use binary search on (maximun piles to 1) to find minimum value of k suitable

class Solution{
    public int minEatingSpeed(int[] piles, int h){
        int l = 1;
        int r = 0;

        for(int pile : piles){
            if(pile > r){
                r = pile;
            }
        }
        int ans = r;

        while(l <= r){

            int mid = l + (r - l)/2;
            int hours = 0;

            for(int pile : piles){
                hours += (pile + mid - 1)/2;
            }

            if(hours <= h){
                ans = mid;
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return ans;
    }
}