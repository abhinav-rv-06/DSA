// Min Subsets with Consecutive Numbers

// sort the array 
class Solution {
    public static int numofsubset(int arr[], int n)
    {
        int count = 1;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++)
            if(arr[i+1] != arr[i]+1)
                count++;
        return count;
    }
}
