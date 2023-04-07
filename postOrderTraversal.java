import java.util.ArrayList;

public class postOrderTraversal {
    static ArrayList<Integer> arrayList = new ArrayList();
    public static void main(String[] args) {

        Node head4 = new Node(13,null,null);
        Node head3 = new Node(11,null,null);
        Node head2 = new Node(8,null,null);
        Node head1 = new Node(10,head3,head4);
        Node head = new Node(19,head1,head2);
        postOrder(head);
    }
    static ArrayList<Integer> postOrder(Node root)
    {
        traverse(root);
        return arrayList;
    }
    static void traverse(Node root){
        if(root==null){
            return;
        }
        traverse(root.left);
        traverse(root.right);

        arrayList.add(root.data);
    }
}
