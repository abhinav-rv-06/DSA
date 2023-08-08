// Generate Grey Code Sequences

class Solution
{
    ArrayList <String> generateCode(int n)
    {
        ArrayList<String> al = new ArrayList<String>();
	    if(n<=0)
			return al;
		al.add("0");
		al.add("1");
		int i=0;
		int j=0;
		// take all 2^n combinations
		for(i=2; i<(1<<n); i= i<<1)
		{
		    // insert all the current arrangements in reverse order
			for(j=i-1; j>=0; j--)
				al.add(al.get(j));
			
			// starting bit is 0 for half of the current arrangements
			for(j=0; j<i; j++)
				al.set(j, "0"+al.get(j));
			
			// starting bit is 1 for next half of the current arrangements
			for (j = i ; j < 2*i ; j++)
				al.set(j, "1" + al.get(j));
		}
		return al;
    }
}
