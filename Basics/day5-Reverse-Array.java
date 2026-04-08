// Problem: Reverse an array
// Platform: take u forward
// Approach: Swap elements from start and end moving towards center
// Time: O(n)
// Space: O(1)
// Key Idea: swap ar[i] with ar[n-i-1] until middle of array


class Solution{
    public static void main(String[] args){
        int[] ar = {1,2,3,4,5,6,7,8,9};

        int loopLen = ar.length/2-1;
        for(int i = 0; i < loopLen; i++){
            int temp = ar[i];
            ar[i] = ar[ar.length-i] ;
            ar[ar.length-i] = temp;
        }
        for (int i : ar) {
            System.out.println(i);
        }
    }
}