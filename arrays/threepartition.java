// Three way partitioning

// Brute force = use any extra space to return final result

//Simply sort it

//Better-
class Solution{
    public void threeWayPartition(int array[], int a, int b)
    {
        int n = array.length-1;
        int l = 0;
        int temp;
        for(int i=0;i<=n;){
            if(array[i]<a){
                temp = array[l];
                array[l] = array[i];
                array[i] = temp;
                l++;
                i++;
            }
            else if(array[i]>b){
                temp = array[n];
                array[n] = array[i];
                array[i] = temp;
                n--;
            }
            else
                i++;
        }
    }
}
