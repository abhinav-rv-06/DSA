// Merge 2 strings

class Solution 
{ 
    String merge(String S1, String S2)
    { 
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
            if (i < s1.length())
                result.append(s1.charAt(i));
            if (i < s2.length())
                result.append(s2.charAt(i));
        }
        return result.toString();
    }
}
