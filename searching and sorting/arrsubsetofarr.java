// Array subset of another array

class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(a1[i],hm.getOrDefault(a1[i],0)+1);
        }
        for(int i=0;i<m;i++){
            if(hm.containsKey(a2[i])){
                if(hm.get(a2[i])==1){
                    hm.remove(a2[i]);
                }else{
                    hm.put(a2[i],hm.get(a2[i])-1);
                }
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}
