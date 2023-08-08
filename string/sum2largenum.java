// Sum of 2 large numbers

class Solution {
    String findSum(String X, String Y) {
        if (str1.length() > str2.length()) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }
        // Take an empty String for storing result
        String str = "";

        // Calculate length of both String
        int n1 = str1.length(), n2 = str2.length();

        // Reverse both of Strings
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        int carry = 0;
        for (int i = 0; i < n1; i++) {
            // Do school mathematics, compute sum of
            // current digits and carry
            int sum = ((int)(str1.charAt(i) - '0') +
                       (int)(str2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');

            // Calculate carry for next step
            carry = sum / 10;
        }

        // Add remaining digits of larger number
        for (int i = n1; i < n2; i++) {
            int sum = ((int)(str2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0) str += (char)(carry + '0');

        // reverse resultant String
        str = new StringBuilder(str).reverse().toString();

        int i = 0, n = str.length();
        while (i < n && str.charAt(i) == '0') i++;

        if (i == n) return "0";

        return str.substring(i);
    }
}
