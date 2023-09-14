// Sort a string

class Solution 
{ 
    String sort(String s) 
    {
        int []f = new int[26];
        Arrays.fill(f,0); // Initialize all frequencies to 0
        
        // Count the frequency of each character in the input string
        for(int i=0;i<s.length();i++){
            f[(int)s.charAt(i)-(int)'a']+=1; // Increment the frequency of the character in the array
        }
        
        // Create an empty string to store the sorted characters
        String ans="";
        
        // Iterate through the frequency array and append the character to the result string
        // as many times as its frequency
        for(int i=0;i<26;i++){
            while(f[i]>0){
                f[i]-=1; // Decrement the frequency of the character
                ans+=(char)(i+(int)'a'); // Append the character to the result string
            }
        }
        
        // Return the sorted string
        return ans;
    }
} 
