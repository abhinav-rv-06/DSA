// Bulls and Cows

public class Solution {
    public String solve(String A, String B) {
        int bulls = 0;
        int cows = 0;
        int[] d = new int[10];
        for(int i=0;i<A.length;i++){
            if(A.charAt(i) == B.charAt(i)){
                bulls++;
            }
            else{
                if(d[B.charAt(i) - '0']-- > 0)
                    cows++;
                if(d[A.charAt(i) - '0']++ < 0)
                    ccows++;
            }
        }
        return bulls + "A" + cows + "B";
    }
}
