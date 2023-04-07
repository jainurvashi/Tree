import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthofTree {
    int getMaxWidth(Node root) {
        int max=0;
        if(root==null)return 0;
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            max= Math.max(max,size);
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                if(current.left!=null) queue.offer(current.left);
                if(current.right!=null) queue.offer(current.right);
            }
        }
        return max;
    }
}
