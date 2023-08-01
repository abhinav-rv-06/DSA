// Search a 2D Matrix

// Brute force - traverse using 2 for loops and find.

// Approach 1 -
// find length and breadth of matrix
//traverse cloumns and find with binary search
// traverse rows and find with binary search -

// binary search normally.
// use amth for finding matrix position
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length ==0){
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int l = 0;
        int r = m*n;

        while(l<r){
            int mid = ((l+r)/2);
            int i = mid/n;
            int j = mid%n;
            if(matrix[i][j] == target){
                return true;
            }
            if(matrix[i][j] < target){
                l = mid+1;
            }
            else{
                r = mid;
            }
        }
        return false;
    }
}

