// Reverse words in a given String

class Solution 
{
    String reverseWords(String S)
    {
        String words[] = s.split("\\.");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if(i!=0)
                result += '.';
        }
        return result;
    }
}
