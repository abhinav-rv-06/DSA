// Search an element in an array

//traverse the array and find.
//return the i of iteration as result of found else -1

    int search(int arr[], int N, int X)
    {
        for(int i=0;i<N;i++){
            if(arr[i]==X){
                return i;
            }
        }
        return -1;
    }
