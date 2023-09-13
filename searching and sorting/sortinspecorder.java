// Sort in specefic order

class Solution
{
    public void sortIt(long arr[], long n)
    {
        int j = 0, k = 0, c = 0;
        long[] e = new long[(int) (n + 1)];
        long[] odd = new long[(int) (n + 1)];

        for (int i = 0; i < n; i++) {
            long o = arr[i];
            if (o % 2 != 0)
                odd[j++] = o;
            else
                e[k++] = o;
        }

        Arrays.sort(e, 0, k);
        Arrays.sort(odd, 0, j);

        for (int i = j - 1; i >= 0; i--) 
            arr[c++] = odd[i];
        for (int i = 0; i < k; i++) 
            arr[c++] = e[i];
    }
}
