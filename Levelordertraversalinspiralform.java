import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Levelordertraversalinspiralform {
    ArrayList<Integer> findSpiral(Node root)
    {

        int a=0;
        ArrayList<Integer> ans = new ArrayList();
        if(root==null) return ans;
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            a++;
            int size = queue.size();
            ArrayList<Integer> aaa = new ArrayList();
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                if(a%2==0){
                    aaa.add(current.data);
                }else{
                    aaa.add(0,current.data);
                }
                if(current.left!=null)queue.offer(current.left);
                if(current.right!=null)queue.offer(current.right);
            }
            ans.addAll(aaa);
        }
        return ans;
    }
}
