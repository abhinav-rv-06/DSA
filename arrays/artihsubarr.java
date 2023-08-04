// Arithmetic Subarrays

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int m = l.length;
        for(int i=0;i<m;i++){
            int len = r[i]-l[i]+1;
            int[] temp = new int[len];
            for(int j=0; j<len; j++){
                temp[j] = nums[j+l[i]];
            }
            ans.add(cBool(temp,len));
        }
        return ans;
    }
    public Boolean cBool(int[] temp, int len){
        Arrays.sort(temp);
        int d = temp[1] - temp[0];
        if(len<3){
            return true;
        }
        else{
            for(int i=1; i<len-1; i++){
                int diff = temp[i+1] - temp[i];
                if(diff != d){
                    return false;
                }
            }
        }
        return true;        
    }
}
