// Number and the Digit sum

class Sol
{
    public static int sumOfDigit(long K) 
    {
        int sod = 0;
        while (K > 0)
        {
            sod += K % 10;
            K /= 10;
        }
        return sod;
    }
    public static long numberCount (long N, long K)
    {
        long low=K+1;
        // no number lesser than or equal to k
        // can have required value of difference
        // hence lower limit for binary search is set to k+1 
        
        long high = N;
        if (K+90 < high) high = K+90; 
        // max sum of digits for a 10 digit
        // decimal number = 90
        // hence difference between (k+90) and
        // sumOfDigits(k+90) will definitely be >= k
        // hence upper limit for binary search is k+90
        
        // time complexity for this binary search is
        // constant as differnece between upper and
        // lower limits is capped at 89
        while (low <= high) 
        {
            long mid = (low + high) / 2;
            if (mid - sumOfDigit(mid) < K)        
                low = mid + 1;
            else       
                high = mid - 1;        
        }
        return (N - high);
    }
}
