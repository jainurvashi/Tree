package easy;

import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSuminBinaryTree {
    public int maxLevelSum(Node node) {
        int maxSum = node.data;
        Queue<Node> queue = new LinkedList();
        queue.offer(node);
        while(!queue.isEmpty()){
            int size = queue.size();
            int sum=0;
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                sum += current.data;
                if(current.left!=null) queue.offer(current.left);
                if(current.right!=null) queue.offer(current.right);
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
