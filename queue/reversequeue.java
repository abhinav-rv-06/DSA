class Main
{
    public Queue<Integer> rev(Queue<Integer> q){
        //using a stack to reverse the queue.
        Stack<Integer> s=new Stack<>();
        //pushing elements from queue into stack and removing them from queue.
        while(!q.isEmpty()){
            int x=q.peek();
            q.poll();
            s.push(x);
        }
        //now pushing elements back into the queue from stack and removing them 
        //from stack. queue gets reversed as stack follows last in first out.
        while(!s.isEmpty()){
            int x=s.peek();
            s.pop();
            q.add(x);
        }
        //returning reversed queue.
        return q;
    }
}
