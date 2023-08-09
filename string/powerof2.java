// Power of 2

/*
0 - (0)
1 - (1) 
1 - (01)
2 - (11)
7 - (0111)
8 - (1000)
15 - (01111)
16 - (10000)
When you take the bitwise "&" of these pairs, you will find that all of them would return 0. So you just have to check if N & (N-1) is 0 then it is a power of 2, otherwise not.
*/

public class Solution {
    public int power(String A) {
        int k = 0;
        int i = 0;
        int len = A.length();
        
        // Convert string to integer
        while (i < len) {
            k = k * 10 + (A.charAt(i) - '0');
            i++;
        }
        
        // Special case according to the problem statement, power should be greater than 0.
        if (k == 1) return 0;
        
        if ((k & (k - 1)) != 0) return 0;
        return 1;
    }
}
