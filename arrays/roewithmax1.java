// Row with Max 1's

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int r = 0;           
        int c = m-1;
        int max_row_index=-1;
        // starting from top right corner
        // go left if you encounter 1
        // do down if you encounter 0
        while(r<n && c>=0)
        {
            if(arr[r][c]==1)
            {
                max_row_index = r;
                c--;
            }
            else
                r++;
        }
        return max_row_index;
    }
}
