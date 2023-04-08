package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
* Given a binary tree of size N, find all the nodes at odd levels.Root is considered at level 1.*/
public class NodesatOddLevels {
    public ArrayList<Node> nodesAtOddLevels(Node root)
    {
        int level=0;
        ArrayList<Node> ans = new ArrayList();
        if(root==null) return ans;
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            level++;
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                if(level%2!=0){
                    ans.add(current);
                }
                if(current.left!=null)queue.offer(current.left);
                if(current.right!=null)queue.offer(current.right);
            }

        }
        return ans;
    }
}
