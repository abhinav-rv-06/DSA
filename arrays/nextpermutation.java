// Next Permutation

class Solution {
    public void nextPermutation(int[] nums) {
        int p = -1, n = nums.length;
        int temp;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p = i;
                break;
            }
        }
        for(int i=n-1;i>=0 && p!=-1;i--){
            if(nums[p]<nums[i]){
                temp = nums[p];
                nums[p] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        int l = p + 1,r = n - 1;
        while(l<r){
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;r--;
        }
    }
}
