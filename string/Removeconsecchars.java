// Remove Consecutive characters

public class Solution {
    public String solve(String A, int B) {
        if (B == 1) return "";

        int N = A.length();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int cnt = 1;
            int j = i + 1;
            while (j < N && A.charAt(j) == A.charAt(i)) {
                j++;
                cnt++;
            }
            if (cnt != B) {
                while (i < j) {
                    res.append(A.charAt(i));
                    i++;
                }
            }
            i = j - 1;
        }
        return res.toString();
    }
}
