// Longest common substring

class Solution{
    int longestUniqueSubsttr(String str){
        int n = str.length();
        int cur_len = 1;  // lenght of current substring
        int max_len = 1;  // result
        int prev_index;  //  previous index
        int i;
        int visited[] = new int[26];
     
        for (i = 0; i < 26;  i++)
            visited[i] = -1;
     
        visited[str.charAt(0)-'a'] = 0;
     
        for (i = 1; i < n; i++)
        {
            prev_index =  visited[str.charAt(i)-'a'];
     
            if (prev_index == -1 || i - cur_len > prev_index)
                cur_len++;
     
            else
            {
                if (cur_len > max_len)
                    max_len = cur_len;
     
                cur_len = i - prev_index;
            }
     
            visited[str.charAt(i)-'a']=i;
        }
     
        if (cur_len > max_len)
            max_len = cur_len;
     
        return max_len;
    }
}
