// Atoi

public class Solution {
    public int atoi(String A) {
        if (A.length() == 0) return 0;
        int i = 0, sign = 0; // sign = 0, means positive, otherwise negative.

        // Ignore all space characters at the beginning
        while (i < A.length() && A.charAt(i) == ' ') i++;

        // Check for its sign, if sign remains zero, that means it is positive,
        // otherwise negative.
        if (i < A.length() && (A.charAt(i) == '-' || A.charAt(i) == '+')) {
            if (i + 1 >= A.length() || A.charAt(i + 1) < '0' || A.charAt(i + 1) > '9') return 0;
            if (A.charAt(i) == '-') sign = 1;
            i++;
        }
        // Take a temporary long variable, long is convenient to use because of overflow.
        // If you don't want to use long, you can add extra conditions before adding extra
        // digit in x.
        long x = 0;
        // Keep iterating the string until you reach the end or
        // until you find any garbage character
        while (i < A.length() && A.charAt(i) >= '0' && A.charAt(i) <= '9') {
            x = x * 10 + (A.charAt(i) - '0'); // Keep appending the digit in order
            if (x > Integer.MAX_VALUE) { // In case of overflow, check for its sign and return accordingly.
                if (sign == 1) return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
            i++;
        }
        // With respect to the sign, return the newly generated integer.
        if (sign == 1) return (int) -x;
        return (int) x;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.atoi("42")); // Example usage
    }
}
