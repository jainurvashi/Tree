import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagTreeTraversal {
    ArrayList<Integer> zigZagTraversal(Node node)
    {
        ArrayList<Integer> arrayList = new ArrayList();
        Queue<Node> queue = new LinkedList();
        queue.offer(node);
        int level=1;
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> child = new ArrayList();
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                if(level%2==0)
                    child.add(0,current.data);
                else
                    child.add(current.data);
                if(current.left!=null) queue.offer(current.left);
                if(current.right!=null) queue.offer(current.right);
            }
            level++;
            arrayList.addAll(child) ;
        }

        return arrayList;
    }
}
