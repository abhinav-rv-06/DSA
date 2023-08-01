// Sort an array of 0's 1's and 2's

// Brute Force = 
// Count number of 0's 1's nd 2's and print it

class Solution
{
    public static void sort012(int a[], int n)
    {
        int low = 0, high = n-1, mid = 0;
        while(mid <= high){
            if(a[mid]==0) {
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            } else if(a[mid]==1) {
                mid++;
            } else {
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        } 
    }
}
