class Solution {
    public static int chocolates(int n, int[] arr) {
        int i = 0;
        int j = n-1;
        
        while(i < j && n > 1){
            if(arr[i]> arr[j])
                i++;
            else
                j--;
            n--;
        }
        return arr[i];
    }
}
