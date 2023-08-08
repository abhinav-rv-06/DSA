// Anagram of String

class Main
{
	public int remAnagrams(String s,String s1)
    {
        int[] c =new int[26];
		int[] c1=new int[26];
		for(int i=0;i<s.length();i++){
			c[s.charAt(i)-'a']++;
		}
		for(int i=0;i<s1.length();i++){
			c1[s1.charAt(i)-'a']++;
		}
		int result=0;
		for(int i=0;i<26;i++){
			result+=Math.abs(c[i]-c1[i]);
		}
		return result;
    }
}
