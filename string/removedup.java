// Remove all duplicates from a given String

class Solution {
    String removeDuplicates(String str) {
        HashMap<Integer,Boolean> h = new HashMap();
        String out  = "";
        for(int i=0; i<str.length(); i++){
            int c;
            if(str.charAt(i) >= 'A'){
                c = str.charAt(i) - 'A';
            }
            else{
                c = str.charAt(i) - 'a';
            }
            
            if(!h.containsKey(c)){
                h.put(c,true);
                out += str.charAt(i);
            }
        }
        return out;
    }
}
