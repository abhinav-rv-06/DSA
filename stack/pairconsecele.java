class Main
{
    public static boolean pairWiseConsecutive(Stack<Integer> st)
    {
        //creating an auxiliary stack to store elements from original stack
        Stack<Integer> aux = new Stack<Integer>();
        int aux_size = 0;
        //transferring elements from original stack to auxiliary stack
        while (!st.empty()) 
        {
            aux.push(st.peek());
            st.pop();
            aux_size++;
	    }
	    boolean result = true;
	    //checking if adjacent elements in the auxiliary stack are pairwise consecutive
	    while (aux_size > 1) 
        {
            int x = aux.peek();
            aux.pop();
            int y = aux.peek();
            aux.pop();
            //checking if absolute difference between adjacent elements is not equal to 1
            if (Math.abs(x - y) != 1)
                result = false;
            //restoring elements back to original stack
            st.push(x);
            st.push(y);
            aux_size--;
            aux_size--;
        }
        //if there is one element left in the auxiliary stack, it is added back to the original stack
        if (aux.size() == 1)
            st.push(aux.peek());
        //returning the result
        return result;
	}
}
