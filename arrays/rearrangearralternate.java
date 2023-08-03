// Rearrange Array Alternatively

// use extra space to do this

class Solution{
    public static void rearrange(long arr[], int n){
        int max = n - 1, min = 0;
    	long a = arr[n - 1] + 1;
    	for (int i = 0; i < n; i++) { 
    		//At even index, we have to put maximum elements in decreasing order. 
    		if (i % 2 == 0) { 
    			arr[i] += (arr[max] % a) * a; 
    			//Updating maximum index.
    			max--; 
    		} 
    		//At odd index, we have to put minimum elements in increasing order. 
    		else { 
    			arr[i] += (arr[min] % a) * a; 
    			//Updating minimum index.
    			min++; 
    		} 
    	} 
    	//Dividing array elements by maximum element to get the result. 
    	for (int i = 0; i < n; i++) 
    		arr[i] = arr[i] / a;
    }
}
