// Equilibrium Point

class Solution {
    public static int equilibriumPoint(long arr[], int n) {
        long r = 0;
        for (int i = 0; i < n; i++) 
           r += arr[i];
        long l = 0;
        for (int i = 0; i < n; i++) {
            r -= arr[i];
            if (l == r) {
                return (i + 1);
            }
            l += arr[i];
        }
        return -1;
    }
}
