package easy;

import java.util.LinkedList;
import java.util.Queue;

//Given a Binary tree. Find the level in binary tree which has the maximum number of nodes.
public class MaximumNodeLevel
{
    public static int maxNodeLevel(Node node)
    {
        int level =0;
        int maxNode =0;
        int maxLevel  =0;
        Queue<Node> queue = new LinkedList();
        queue.offer(node);
        while(!queue.isEmpty()){
            int size = queue.size();
            if(maxNode<size){
                maxLevel = level;
                maxNode = size;
            }
            level++;
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                if(current.left!=null) queue.offer(current.left);
                if(current.right!=null) queue.offer(current.right);
            }
        }
        return maxLevel;
    }
}
