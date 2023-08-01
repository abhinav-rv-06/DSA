// Missing number

// What I can think of? -
//Use array or map to initial all colums with numbers till n.
// increment count if found while traversal
// scan map or array to find ihe missing one and print it.

// Better -
class Compute { 
    public static int missingNumber(int A[], int N)
    {
        int i, sum=0;
        for(i=0;i<N-1;i++)
            sum+=A[i];
        return ((N*(N+1))/2)-sum;
    }
}
