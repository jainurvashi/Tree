import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewofBinaryTree {
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans = new ArrayList();
        if(root==null) return ans;
        Queue<Node> queue = new LinkedList();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                if(i==size-1)
                    ans.add(current.data);
                if(current.left!=null) queue.offer(current.left);
                if(current.right!=null) queue.offer(current.right);
            }
        }
        return ans;
    }
}
