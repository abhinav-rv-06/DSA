// Binary array sorting

class Solution
{
    static void binSort(int A[], int N)
    {
        int low = 0, high = N-1;
        
        //Using segregation method.
        while(low <=  high){
       //If element at left index is 0, we increase the left index.
        if(A[low] == 0){
            low++;
        }
        //Else If element at high index is 1, we decrease the right index.
        else if(A[high] == 1){
            high--;
        }
        //Else, we swap the elements at left and right index.
        else{
            int temp = A[low];
            A[low] = A[high];
            A[high] = temp;
            //Updating values of left and right index after swapping.
            low++;
            high--;
        }
        }
    }
}

// other approach - count number of 0's and 1's and print those 0's and 1's.
