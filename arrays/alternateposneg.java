// Alternate positive and negative numbers

// Traverse the array - if negative found add to negarry
// if poistive found, add to pos array
//traverse again alternatively append pos and neg

void rearrange(int arr[], int n){
    ArrayList<Integer> neg = new ArrayList<Integer>();
    ArrayList<Integer> pos = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
        if (arr[i] < 0)
            neg.add(arr[i]);
        else
            pos.add(arr[i]);
    }
    int i = 0, j = 0, k = 0;
    while (i < neg.size() && j < pos.size()) {
        arr[k++] = pos.get(j++);
        arr[k++] = neg.get(i++);
    }
    while (j < pos.size()) { arr[k++] = pos.get(j++); }
    while (i < neg.size()) { arr[k++] = neg.get(i++); }
}
