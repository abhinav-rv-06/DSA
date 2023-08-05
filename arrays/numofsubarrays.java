// Count the number od subarrays

class Solution 
{ 
    long countSubarray(int n,int arr[],long L,long R) {
        long Rcnt = countSub(arr, n, R);
        long Lcnt = countSub(arr, n, L - 1);
        return Rcnt - Lcnt;
    }
    static long countSub(int arr[], int n, long x)
    {
        // Starting index of sliding window.
        int st = 0;
        // Ending index of sliding window.
        int end = 0;
        // Sum of elements currently present in sliding window.
        int sum = 0;
        // To store required number of subarrays.
        long cnt = 0;
        // Increment ending index of sliding window one step at a time.
        while (end < n)
        {
            // Update sum of sliding window on adding a new element.
            sum += arr[end];
            // Increment starting index of sliding window until sum is greater than x.
            while (st <= end && sum > x)
            {
                sum -= arr[st];
                st++;
            }
            // Update count of number of subarrays.
            cnt += (end - st + 1);
            end++;
        }
        return cnt;
    }
}
