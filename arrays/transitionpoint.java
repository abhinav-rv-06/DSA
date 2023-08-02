// Find Transition Point

// Brute force by traversing the array and return first one.

// Binary Search like technique.

class Main {
    int transitionPoint(int arr[], int n) {
        if (arr[0] == 1)
            return 0;
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == 0)
                l = mid + 1;
            else if (arr[mid] == 1) {
                if (arr[mid - 1] == 0) return mid;
                r = mid - 1;
            }
        }
        return -1;
    }
}
