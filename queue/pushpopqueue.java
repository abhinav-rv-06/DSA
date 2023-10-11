class Solution
{
    public Queue<Integer> push(int arr[], int n)
    {
        //push all the elements of the array arr in the queue and return the queue
        Queue<Integer> qu = new LinkedList<Integer>();
        for(int i =0;i<n;i++){
            qu.add(arr[i]);
        }
        return qu;
    }
    
    public void _pop(Queue<Integer> q)
    {
        //dequeue the elements and print them
        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
    }
}
