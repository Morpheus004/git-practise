import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;      

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> O=new ArrayList<>();
        Queue<Node> Q=new LinkedList<>();
        System.out.println("jgsdgsdjl");
        
        Q.add(node);
        while(!Q.isEmpty())
        {
            Node N=Q.remove();
            O.add(N.data);
            if(N.left==null||N.right==null);
            if(N.left!=null)Q.add(N.left);
            if(N.right!=null)Q.add(N.right);
        }
        return O;
    }
}
