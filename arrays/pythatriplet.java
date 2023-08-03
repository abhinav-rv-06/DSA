// Pythagorean Triplet

// 3 for loops

// 2 for loops, 2 for loop

// sort - window with 2 - pointer keep shifting.
class Solution {
    boolean checkTriplet(int[] arr, int n) {
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            long ab = arr[i]*arr[i] + arr[i+1]*arr[i+1];
            for(int j=i+2;j<n;j++){
                long c = arr[j]*arr[j];
                if(ab == c){
                    return true;
                }
            }
        }
        return false;
    }
}
// not working --- :(

// used hash for easy computation
class Solution {
    boolean checkTriplet(int[] arr, int n) {
        int maximum = 0;
        for (int i = 0; i < n; i++) {
            maximum = Math.max(maximum, arr[i]);
        }
        int[] hash = new int[maximum + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        for (int i = 1; i < maximum + 1; i++) {
            if (hash[i] == 0) continue;
            for (int j = 1; j < maximum + 1; j++) {
                if ((i == j && hash[i] == 1) || hash[j] == 0) continue;
                int val = (int) Math.sqrt(i * i + j * j);
                if ((val * val) != (i * i + j * j)) continue;
                if (val > maximum) continue;
                if (hash[val] > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
