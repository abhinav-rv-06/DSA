// Maximum subset XOR

class Solution
{
    public static int maxSubsetXOR(int set[], int n)
    {
        int index = 0;
        for (int i=31; i>=0; i--)
        {
            int maxInd = index;
		    int maxEle = -2147483648;
            for (int j=index; j<n; j++)
            {
                if ( (set[j]&(1<<i))!= 0 && set[j]>maxEle )
			    {	maxEle = set[j];
				    maxInd = j;}
            }
            if (maxEle == -2147483648)
                continue;
		    int t = set[index];
		    set[index] = set[maxInd];
		    set[maxInd] = t;
            maxInd = index;
            for (int j=0; j<n; j++)
            {
                if ((j!=maxInd) && ((set[j] & (1<<i)) !=0))
                    set[j] = set[j]^set[maxInd];
            }
            index++;
        }
        int res = 0;
        for (int i=0; i<n; i++)
            res ^= set[i];
        return res;
    }
}
