// Cyclically rotate an array by one

// store first element in temp
// update current element to its next element 
// make last element temp value

class Compute {
    public void rotate(int arr[], int n)
    {
        int t = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = t;
    }
}
