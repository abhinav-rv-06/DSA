// Rope cutting

class Solution{
    public static ArrayList<Integer> RopeCutting (int arr[], int n) {
        Arrays.sort(arr);
        int sub_sum = arr[0];
        List<Integer> v = new ArrayList<>();
        
        if (n == 1) {
            v.add(0);
        } else {
            int count = 0;
            for (int i = 1; i < n; i++) {
                if ((arr[i] - sub_sum) > 0) {
                    sub_sum += arr[i] - sub_sum;
                    v.add(n - i);
                    count++;
                }
            }
            if (count == 0) {
                v.add(0);
            }
        }
        return v;
    }
}
