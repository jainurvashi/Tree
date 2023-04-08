package easy;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightNode {
//10 2 6 8 N N 5
    public static void main(String[] args) {
        Node head4 = new Node(5,null,null);
        Node head3 = new Node(8,null,null);
        Node head2 = new Node(6,null,head4);
        Node head1 = new Node(2,head3,null);
        Node head = new Node(10,head1,head2);
        nextRight(head,8);
    }

    static Node nextRight(Node root, int key)
    {
        boolean isDataExist =false;
        int existLevel =0;
        int level =0;
        Node node= new Node(-1,null,null);
        if(root==null)return node;
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                if(isDataExist && level ==existLevel)
                    return current;
                if(current.data == key){
                    isDataExist = true;
                    existLevel = level;
                }
                if(current.left!=null) queue.offer(current.left);
                if(current.right!=null) queue.offer(current.right);
            }
            level++;
        }
        return node;
    }
}
