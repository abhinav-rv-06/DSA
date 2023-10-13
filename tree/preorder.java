// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    static void preorderUtil(Node root, ArrayList<Integer> res)
    {
        //preorder traversal works on Root Left Right.
          
        //if root is null then we simply return.
        if (root==null) 
            return;
            
        //first we store the data at root in a list.
        res.add(root.data);
        //then we call the recursive function for left subtree.
        preorderUtil(root.left, res);
        //then we call the recursive function for right subtree.
        preorderUtil(root.right, res);
    }
    
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder (Node root)
    {
        ArrayList<Integer> res = new ArrayList<Integer> (0);
        preorderUtil (root, res);
        //returning the list.
        return res;
    }
}
