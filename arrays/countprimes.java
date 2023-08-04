// Count Primes

class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        int count = 0;
        for(int i=2; i<Math.sqrt(n); i++){
            if(prime[i]==false){
                for(int j = i+i; j<n; j+=i){
                    prime[j] = true;
                }
            }
        }
        for(int a=2; a<n; a++){
            if(prime[a]==false){
                count++;
            }
        }
        return count;
    }
}
