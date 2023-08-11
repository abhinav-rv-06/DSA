// Count zeros in a sorted matrix

class Main
{
    int countZeros(int A[][], int n)
    {
        int row = n-1; 
		int col = 0;
		int count = 0;
		while(col < n)
		{
			while(A[row][col] != 0)
				if(--row < 0)
					return count;
			count += (row+1);
			
		col++;
		}
	    return count;
    }
}
