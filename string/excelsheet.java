// Excel Sheet Part - 1

class Solution {
    public String excelColumn(int N){
        String ans="";
        while(n>0)
        {
            int rem = n%26;
            // If remainder is 0, then a 'Z' must be there in output 
            if(rem == 0)
            {
                ans = 'Z' + ans;
                n = n/26 - 1;
            }
            // If remainder is non-zero 
            else
            {
                ans = (char)(n%26 - 1 + 'A') + ans;
                n /= 26;
            }
        }
        return ans;
    }
}
