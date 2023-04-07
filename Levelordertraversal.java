import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Levelordertraversal {
    static ArrayList<Integer> levelOrder(Node node)
    {
        ArrayList<Integer> arrayList = new ArrayList();
        Queue<Node> queue = new LinkedList();
        queue.offer(node);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                arrayList.add(current.data);
                if(current.left!=null) queue.offer(current.left);
                if(current.right!=null) queue.offer(current.right);
            }
        }
        return arrayList;
    }
}
