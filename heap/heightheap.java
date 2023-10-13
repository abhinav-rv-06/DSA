//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.heapHeight(N, arr));
        }
    }
}
// } Driver Code Ends

class Solution{
    static int heapHeight(int N, int arr[]){
        int count = 1;
	    int i = 0, mul = 1;
	    while(i < N-1){
            // Adding 1 to the count if there are more elements to be added at the next level of the heap.
	        if(i + mul*2 < N-1)
	            count++;
	        mul *= 2;
	        i += mul;
	    }
	    return count;
    }
}
