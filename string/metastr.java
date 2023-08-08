// Meta Strings

class Solution 
{ 
    boolean metaStrings(String S1, String S2) 
    { 
        int freq[] = new int[26];
        Arrays.fill(freq,0);
        // if the lengths are different, we cannot make them equal
        if (S1.length () != S2.length ())
            return false;
        for (int i = 0; i < S1.length (); ++i)
        {
            // increasing the frequency by 1 if the character is present in s1
            // and decreasing the frequency by 1 if the character is present in s2
            freq[S1.charAt(i) - 'a']++;
            freq[S2.charAt(i) - 'a']--;
        }
        // if any character has non-zero frequency, it means there's an unbalance
        // of that character in both the strings
        // hence, we return false in that case
        for (int i = 0; i < 26; ++i)
        {
            if (freq[i] != 0)
            return false;
        }
        int cnt = 0;
        for (int i = 0; i < S1.length (); ++i)
        {
            if (S1.charAt(i) != S2.charAt(i)) cnt++;
        }
        // if different positions are equal to 2, we can swap them
        return (cnt == 2);
    }
}
