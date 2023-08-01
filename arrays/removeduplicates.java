// Remove duplicate elements from sorted array

// Traverse - in next element same increment pointer
// not same increment both
// return the first poiner.

class Solution {
    int remove_duplicate(int A[],int N){
        int j=0;
        for(int i=1; i<N; i++)
        {
            if(A[j]!=A[i])
            {
                j++;
                A[j] = A[i];
            }
        }
        return j+1;
    }
}
