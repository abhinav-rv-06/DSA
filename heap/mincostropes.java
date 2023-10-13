//{ Driver Code Starts
//Initial Template for Java

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass
{
    // Driver Code
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
        
        Long nextLong(){
            return Long.parseLong(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			long arr[] = new long[n];
			
			for(int i=0; i<n; i++)
				arr[i] = sc.nextLong();
		    out.println(new Solution().minCost(arr, n));
		    t--;
		}
		out.flush();
	}
}
// } Driver Code Ends

class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        //implementing MinHeap using priority queue.
        PriorityQueue<Long> pq = new PriorityQueue<>();
         
        for (int i = 0; i < n; i++) pq.add(arr[i]);
        Long cost = new Long("0");
        
        //using a loop while there is more than one element in priority queue. 
        while (pq.size() != 1) 
        {
            //storing the first and second numbers from priority queue.
            long x = pq.poll();  
            long y = pq.poll(); 
            
            //adding their sum in result.
            cost += (x + y);
            
            //pushing the sum of first and second numbers in priority queue.
            pq.add(x + y); 
        }
        //returning the result.
        return cost;
    }
}
