// Minimum Days

class Solution {
    public static int getMinimumDays(int N, String S, int[] P) {
        int days = 0;
        char[] s = S.toCharArray();
        int i=1;
        while(i<S.length()){
            if(s[i-1] != s[i] || (s[i-1] == '?' && s[i] == '?')){
                i++;
            }
            else{
                if(days<P.length){
                    s[P[days]] = '?';
                    days++;
                }
                else{
                    return -1;
                }
            }
        }
        return days;
    }
}
