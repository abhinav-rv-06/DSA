// Count more than n/k occurrences

class Solution 
{
    public int countOccurence(int[] arr, int n, int k) 
    {
        int barrier=n/k;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> element:map.entrySet()){
            if(element.getValue()>barrier) count++;
        }
        return count;
    }
}
