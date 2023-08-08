// Maximum Occuring Character

class Solution
{
    public static char getMaxOccuringChar(String line)
    {
        StringBuffer sb=new StringBuffer();
        char[] s=line.toCharArray();
	     int[] arr=new int[26];
	     int max=-1;
	     char result='\u0000';
	     
	     //using hash table to store count of each character.
	     for(int i=0;i<s.length;i++)
	     {
	         char c=s[i];
	         if(c!=' ')
	         {
	             arr[c-'a']++;
	         }
	     }
	     
	     //iterating over the hash table.
	     for(int i=0;i<arr.length;i++)
	     {
	         //we keep storing the maximum value in hash 
             //table and its corresponding character.
	         if(arr[i]>max)
	         {
	             max=arr[i];
	             result=(char)(i+'a');
	         }
	     }
	     //returning the character with maximum occurrences.
	     return result;
    }
}
