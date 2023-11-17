import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class November9L2 {
    
}
class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> O=new ArrayList<>();
        Queue<Node> Q=new LinkedList<>();
        
        Q.add(node);
        while(!Q.isEmpty())
        {
            Node N=Q.remove();
            O.add(0,N.data);
            if(N.left==null||N.right==null);
            if(N.right!=null)Q.add(N.right);     //normal traversal me left pehle tha fir right tha isme right pehle insert kar diyaa
            if(N.left!=null)Q.add(N.left);
            
        }
        return O;
        Collections.reverse(O);
        return O;
    }
}
