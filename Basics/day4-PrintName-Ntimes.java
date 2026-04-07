// Problem: Print a given name n times using recursion
// Platform: take u forward
// Approach: Recursive (increase count until it reaches n)
// Time: O(n)
// Space: O(n)  (due to recursion stack)
// Key Idea: print name and recursively call function with count+1 until count == n

class Solution{
    public static void printName(String name, int n, int count){
            
            if (n == count) {
                return;
            }
            System.out.println(name);
    
            printName(name, n, count+1);
        }
}


