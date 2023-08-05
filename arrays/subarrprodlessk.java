// Subarray product less than K

class Solution {
    public long countSubArrayProductLessThanK(long a[], int n, long k)
    {
        long p = 1;
        long res = 0;
        for (int start = 0, end = 0; end < n; end++) {
            p *= a[end];
            while (start < end && p >= k)
                p /= a[start++];
            if (p < k) {
                int len = end - start + 1;
                res += len;
            }
        }
        return res;
    }
}



// other type approach (not fully correct check edge cases. - right side approach
        int lp = n-1;
        long product = 1;
        long p = 1;
        int count = 0;
        for(int b =0;b<n;b++){
            product *= a[b];
        }
        for(int i=0;i<n;i++){
            lp = n-1;
            p = product;
            while(p>=k && i<=lp){
                p /= a[lp--];
            }
            count += lp - i + 1;
            product /= a[i];
        }
        return count;
