package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Largestvalueineachlevel {
    //Given a binary tree, find the largest value in each level.
    public ArrayList<Integer> largestValues(Node root)
    {
        ArrayList<Integer> arrayList = new ArrayList();
        if(root==null) return arrayList;
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                max = Math.max(max,current.data);
                if(current.left!=null)queue.offer(current.left);
                if(current.right!=null)queue.offer(current.right);
            }
            arrayList.add(max);
        }
        return arrayList;
    }
}
