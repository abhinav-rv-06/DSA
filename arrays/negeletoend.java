// Move all negative elements to end

// Brutte force - 
// traverse array
// if negative found, append to new array
// if positive found append to positive array join negative array

// other -
class Solution {
    public void segregateElements(int arr[], int n)
    {
        int negarr[] = new int[n];
        int j = 0;
        int i = 0;
        int k = 0;
        for(i=0;i<n;i++){
            if(arr[i]<0){
                negarr[k] = arr[i];
                k++;
            }
            else{
                arr[j] = arr[i];
                j++;
            }
        }
        for(int a=0;a<k;a++){
            arr[j] = negarr[a];
            j++;
        }
    }
}
