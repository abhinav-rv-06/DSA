// Peak Element

// Traverse array, for each element, check adjacents, return peak encountered.

// Binary search type method

class Solution
{
	public int peakElement(int[] arr,int n){
		return peakElementUtil(arr,0,n-1,n);
	}
	public static int peakElementUtil(int[] arr,int low,int high,int n){
		int mid=(low+high)/2;
		if ((mid == 0 || arr[mid-1] <= arr[mid]) &&(mid == n-1 || arr[mid+1] <= arr[mid]))
			return mid;
		else if(mid>0&&arr[mid-1]>arr[mid])
			return peakElementUtil(arr,low,mid-1,n);
		else
			return peakElementUtil(arr,mid+1,high,n);
	}
}
