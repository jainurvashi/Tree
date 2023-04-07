import java.util.ArrayList;

public class PreorderTraversal {
    static ArrayList<Integer> arrayList = new ArrayList();
    public static void main(String[] args) {

            Node head3 = new Node(2,null,null);
            Node head2 = new Node(4,null,null);
            Node head1 = new Node(4,head2,head3);
            Node head = new Node(1,head1,null);
        preorder(head);
    }
    static ArrayList<Integer> preorder(Node root)
    {
        traverse(root);
        return arrayList;
    }
    static void traverse(Node root){
        if(root==null){
            return;
        }
        arrayList.add(root.data);
        traverse(root.left);
        traverse(root.right);
    }
}
