// Check if strings are rotations of each other or not.

class Solution
{
    public static boolean areRotations(String s1, String s2 )
    {
        if((s1.length()==s2.length())&&((s1+s1).contains(s2)))
        {
            return true;
        }
        return false;
    }
}
