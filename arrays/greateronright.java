// Greater on right side

// traverse array
// for each traversal traverse from its right to last o fing max and update it.

class Solution {
    void nextGreatest(int arr[], int n) {
        // Initialize the next greatest element
        int max_from_right =  arr[n-1];
        arr[n-1] = -1;
        // Replace all other elements with the next greatest
        for (int i = n-2; i >= 0; i--)
        {
            int temp = arr[i];
            arr[i] = max_from_right;
            if(max_from_right < temp)
                max_from_right = temp;
        }
    }
}
