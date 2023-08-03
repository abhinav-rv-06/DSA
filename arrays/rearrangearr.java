// Rearrange an array with 0{1} extra space

class Solution
{
    static void arrange(long arr[], int n)
    {
        int i = 0;
        for(i = 0; i < n; i++)
         arr[(int)i]+=(arr[(int)arr[(int)i]]%n)*n;
        for(i = 0; i < n; i++)
            arr[(int)i] = arr[(int)i]/n;
    }
}
