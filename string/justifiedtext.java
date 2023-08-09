// Justified Text

public class Solution {
    public ArrayList<String> fullJustify(ArrayList<String> A, int B) {
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        int t = 0;
        
        for (String line : A) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '{' || line.charAt(i) == '[') {
                    ans.add(s.toString());
                    s = new StringBuilder();
                    
                    for (int j = 0; j < t; j++) {
                        s.append('\t');
                    }
                    
                    s.append(line.charAt(i));
                    ans.add(s.toString());
                    t++;
                    s = new StringBuilder();
                    
                    for (int j = 0; j < t; j++) {
                        s.append('\t');
                    }
                } else if (line.charAt(i) == '}' || line.charAt(i) == ']') {
                    ans.add(s.toString());
                    s = new StringBuilder();
                    t--;
                    
                    for (int j = 0; j < t; j++) {
                        s.append('\t');
                    }
                    
                    s.append(line.charAt(i));
                    if (i + 1 < line.length() && (line.charAt(i + 1) == ',')) {
                        s.append(line.charAt(i + 1));
                        i++;
                    }
                    
                    ans.add(s.toString());
                    s = new StringBuilder();
                    
                    for (int j = 0; j < t; j++) {
                        s.append('\t');
                    }
                } else if (line.charAt(i) == ',') {
                    s.append(line.charAt(i));
                    ans.add(s.toString());
                    s = new StringBuilder();
                    
                    for (int j = 0; j < t; j++) {
                        s.append('\t');
                    }
                } else {
                    s.append(line.charAt(i));
                }
            }
            ans.add(s.toString());
            s = new StringBuilder();
        }
        
        int flag = 0;
        for (int i = 0; i < ans.size(); i++) {
            flag = 0;
            for (int j = 0; j < ans.get(i).length(); j++) {
                if (ans.get(i).charAt(j) != '\t' && ans.get(i).charAt(j) != ' ') {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                ans.remove(i);
                i--;
            }
        }
        
        return ans;
    }
}
