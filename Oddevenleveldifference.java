package easy;

import java.util.LinkedList;
import java.util.Queue;
/*Given a Binary Tree. Find the difference between the
 sum of node values at even levels and the sum of node values at the odd levels.*/
public class Oddevenleveldifference {
    int getLevelDiff(Node root)
    {
        int sumOdd=0;
        int sumEven=0;
        int level=0;
        if(root==null) return 0;
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                if(level%2==0){
                    sumEven+=current.data;
                }else{
                    sumOdd+=current.data;
                }
                if(current.left!=null)queue.offer(current.left);
                if(current.right!=null)queue.offer(current.right);
            }
            level++;
        }
        return  sumEven-sumOdd;
    }
}
