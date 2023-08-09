// Stringoholics

public class Solution {
    static final int mod = 1000000007;

    static long smallestString(String pat) {
        int M = pat.length();
        int len = 0;
        int[] lps = new int[M];
        lps[0] = 0;

        int i = 1;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        long t1 = lps[M - 1];
        long t2 = M - t1;
        if (t1 < t2) return M;
        else if (t1 % t2 != 0) return M;
        else return t2;
    }

    public int solve(ArrayList<String> A) {
        int len = A.size();
        long[] v = new long[len];

        for (int i = 0; i < len; i++) {
            long n = smallestString(A.get(i));
            long k = 1;
            while (true) {
                long changes = (k * (k + 1)) / 2;
                if (changes % n == 0) {
                    v[i] = k;
                    break;
                }
                k++;
            }
        }

        long ans = 1;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len && v[i] != 1; j++) {
                v[j] = v[j] / gcd(v[j], v[i]);
            }
            ans = (ans % mod * v[i] % mod) % mod;
        }
        return (int) (ans % mod);
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
