package easy;

import java.util.LinkedList;
import java.util.Queue;
/*Given a Binary Tree, write a function to check whether the given Binary Tree is a prefect Binary Tree or not.
A Binary tree is Perfect Binary Tree in which all internal nodes have two children and all leaves are at same level.*/
public class PerfectBinaryTree {
    public boolean isPerfect(Node node){
        Queue<Node> queue = new LinkedList();
        queue.offer(node);
        int level=1;
        while(!queue.isEmpty()){
            int size = queue.size();
            if(level!=size)return false;
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                if(current.left!=null) queue.offer(current.left);
                if(current.right!=null) queue.offer(current.right);
            }
            level*=2;
        }

        return true;
    }
}
