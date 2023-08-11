// Last index of One

class Solution {
    public int lastIndex( String s) {
        boolean flag = false;
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                flag = true;
                return i;
            }
        }
        if (!flag) {
            return -1;
        }
        return -1;
    }
}
