// Longest Distinct characters in a string

class Solution{
    static int longestSubstrDistinctChars(String S){
        HashMap<Character, Integer> seen = new HashMap<>(); 
        int maximum_length = 0;
        int start = 0;
        for(int end = 0; end < S.length(); end++)
        {
        if(seen.containsKey(S.charAt(end)))
        {
            // If we have seen the number, move the start pointer
            // to position after the last occurrence
            start = Math.max(start, seen.get(S.charAt(end)) + 1);
        }
        // Updating the last seen value of the character
        seen.put(S.charAt(end), end);
        maximum_length = Math.max(maximum_length, end-start + 1);
        }
        return maximum_length;
    }
}
