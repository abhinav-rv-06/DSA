// Boolean Matrix

// Brute Force
class Solution
{
    void booleanMatrix(int matrix[][])
    {
        int R = matrix.length;
        int C = matrix[0].length;
        int r=0, c=0;
        int row[] = new int[R*C];
        int col[] = new int[C*R];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(matrix[i][j] == 1){
                    row[r] = i;
                    col[c] = j;
                    c++;
                    r++;
                }
            }
        }
        for(int a=0;a<r;a++){
            int temp = row[a];
            for(int b=0;b<C;b++){
                matrix[temp][b] = 1;
            }
        }
        for(int a=0;a<c;a++){
            int temp = col[a];
            for(int b=0;b<R;b++){
                matrix[b][temp] = 1;
            }
        }
    }
}

// Optimised -
class Solution
{
    void booleanMatrix(int matrix[][])
    {
        int r = matrix.length;
        int c = matrix[0].length;
        int row[] = new int[r];
        int col[] = new int[c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(matrix[i][j] == 1){
                    row[i] = 1;
                    col[j] = 1;
                }  
            }
        }
        
        for(int i =0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 1;
                }
            }
        }
    }
}
