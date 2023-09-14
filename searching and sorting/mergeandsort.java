// Merge and sort

class Solution {

    public static int mergeNsort(int a[], int b[], int n, int m, int answer[])
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++)
        {
            set.add(a[i]);
        }
        for(int i=0; i<m; i++)
        {
            set.add(b[i]);
        }
        
        int i=0;
        for(int e : set) 
        {
          answer[i] = e; 
          i++;
        }
        return i;
    }
}
