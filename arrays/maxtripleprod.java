// Maximum Triplet Product

class Solution {
    Long maxTripletProduct(Long arr[], int n)
    {
        Long maxA = (long)-1e9, maxB = (long)-1e9, maxC = (long)-1e9;
        Long minA = (long)1e9, minB = (long)1e9;
        for (int i = 0; i < n; i++)
        {
            // maximum element
            if (arr[i] > maxA)
            {
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            }
            // Update second maximum and third maximum element
            else if (arr[i] > maxB)
            {
                maxC = maxB;
                maxB = arr[i];
            }
            // Update third maximum element
            else if (arr[i] > maxC)
                maxC = arr[i];
            // Update Minimum and second mimimum element
            if (arr[i] < minA)
            {
                minB = minA;
                minA = arr[i];
            }
            // Update second mimimum element
            else if(arr[i] < minB)
                minB = arr[i];
        }
        Long ans = Math.max(minA * minB * maxA, maxA * maxB * maxC);
        return ans;
    }
}
