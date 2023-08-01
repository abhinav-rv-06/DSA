//check if 2 arays are equal or not.

// Approach - 1
// brute force -
// travere array A - outer
// traverse array B - inner
// make an array of elements found and mark them true.

// Approach - 2
// Sort both
// compare each element 
// sorting may take more time

// Approah - 3
// Traverse A update matrix of common memory with count
// Traverse B decrease count if found
// check if all count is 0 thern return true.

//Arrays.equals(arr1,arr2);

// Map usage - not array
import java.io.*;
import java.util.*;
 
class MAIN {
    public static boolean areEqual(int arr1[], int arr2[])
    {
        int N = arr1.length;
        int M = arr2.length;
        if (N != M)
            return false;
        
      // hash map
        Map<Integer, Integer> map
            = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (map.get(arr1[i]) == null)
                map.put(arr1[i], 1);
            else {
                count = map.get(arr1[i]);
                count++;
                map.put(arr1[i], count);
            }
        }
 
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(arr2[i]))
                return false;
            if (map.get(arr2[i]) == 0)
                return false;
            count = map.get(arr2[i]);
            --count;
            map.put(arr2[i], count);
        }
        return true;
    }
 
    public static void main(String[] args)
    {
        int arr1[] = { 3, 5, 2, 5, 2 };
        int arr2[] = { 2, 3, 5, 5, 2 };
 
        if (areEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
