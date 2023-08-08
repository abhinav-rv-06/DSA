// Length of Last Word

class Solution {
    public int lengthOfLastWord(String s) {
        int l = s.length() - 1;
        while (l >= 0 && s.charAt(l) == ' ')
            l--;
        int lastIndex = l;
        while (l >= 0 && s.charAt(l) != ' ')
            l--;
        return lastIndex - l;
    }
}
