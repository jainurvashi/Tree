import java.util.*;

public class Printallnodesthatdonthavesibling {
    ArrayList<Integer> noSibling(Node node)
    {
        ArrayList<Integer> arrayList = new ArrayList();
        Queue<Node> queue = new LinkedList();
        queue.offer(node);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                if(current.left!=null && current.right!=null ||
                        current.left==null && current.right==null){

                }
                else if(current.left==null ){
                    arrayList.add(current.right.data);
                }
                else{
                    arrayList.add(current.left.data);
                }
                if(current.left!=null) queue.offer(current.left);
                if(current.right!=null) queue.offer(current.right);
            }
        }
        if(arrayList.size()==0)
            arrayList.add(-1);

         Collections.sort(arrayList);
         return arrayList;
    }
}
