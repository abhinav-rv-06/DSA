// Missing element of AP

// Approach - abstract ideas in my brain
// Array is sorted.
// binary search like approach
// take first , last and middle emenent.
// take diffeence between their successor or predecessor.
// the one that occurs max number of times is the AP difference.
// traverse from first and last if next element more than the differnce that to be inserted number returned.

// find difference by first - last / no.of elements
// recursively call - for binary search

class Solution {
    int findMissing(int[] arr, int n) {
        int diff = (arr[n - 1] - arr[0]) / n;
        return findMissingUtil(arr, 0, n - 1, diff);
    }
    
    public int findMissingUtil(int[] arr, int low, int high, int diff) {
        if (high <= low)
            return Integer.MAX_VALUE;
        
        //base case
        int mid = low + (high - low) / 2;

        if (arr[mid + 1] - arr[mid] != diff)
            return (arr[mid] + diff);
        // The element just before mid is missing
        if (mid > 0 && arr[mid] - arr[mid - 1] != diff)
            return (arr[mid - 1] + diff);

        //recursion
        // for right half
        if (arr[mid] == arr[0] + mid * diff)
            return findMissingUtil(arr, mid + 1, high, diff);

        // Else recur for left half
        return findMissingUtil(arr, low, mid - 1, diff);
    }
}
