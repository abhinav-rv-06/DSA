// Two Repeated Elements

class Solution
{
    public int[] twoRepeated(int arr[], int N)
    {
        boolean first = false;
        int[] res = new int[2];
        //iterating over the array elements.
        for(int p=0;p<n+2;p++)
        {
            //making the visited elements negative.
		    if(arr[Math.abs(arr[p])] > 0)
		    {
		        arr[Math.abs(arr[p])] = -arr[Math.abs(arr[p])];
		    }
		    //if the number is negative, it was visited previously
            //so this would be the repeated element.
		    else
		    {
		        //storing first and second repeated element accordingly.
		        if(first==false)
	            {
	                res[0] = Math.abs(arr[p]);
	                first = true;
	            }
		        else
		            res[1] = Math.abs(arr[p]);
		            
		    }
        }
        return res;
    }
}
