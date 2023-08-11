// Searching an element in a sorted array

class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        int l = 0, r = n-1;
        int m = l + (r-l) / 2;
        while (l <= r) 
        {
    	     m = l + (r - l) / 2; 
    	    if (arr[m] == k) 
    		    return 1;
    	    if (arr[m] < k) 
    		    l = m + 1;
    	    else
    		    r = m - 1; 
        }
        return -1;
    }
}
