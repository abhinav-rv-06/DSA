// Subarray with given sum

// Brute force -
// Traverse i from 0 to N
// taaverse j and keep adding till equal to sum 
// if found return else break and increment i

class Solution
{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int start = 0;
        int last = 0;
        int currsum=0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            currsum+= arr[i];
            if(currsum>=s)
            {
                last=i;
                while(s<currsum && start<last)
                {
                    currsum-= arr[start];
                    start++;
                }
                if(currsum==s)
                {
                    res.add(start + 1);
                    res.add(last + 1);
                    return res;
                }
            }
        }
        res.add(-1);
        return res;  
    }
}
