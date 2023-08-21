// Search in a matrix

class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        int i = 0, j = m-1;
        while ( i < n && j >= 0 )
        {
            if( mat[i][j] == x )
            {
                return 1;
            }
            if(mat[i][j] > x)
                j--;
            else
                i++;
        }
       return 0;
    }
}
