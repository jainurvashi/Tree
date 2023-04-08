package easy;
/*Given A binary Tree. Your task is to remove all the half nodes (which has only one child).*/
public class RemoveHalfNodes {
    public static void main(String[] args) {

        //6 6 9 6 N 9 5 4 6 N 5
        Node head8 = new Node(5,null,null);
        Node head7 = new Node(6,null,null);
        Node head6 = new Node(4,null,null);
        Node head5 = new Node(5,null,null);
        Node head4 = new Node(9,null,head8);
        Node head3 = new Node(6,head6,head7);
        Node head2 = new Node(9,head4,head5);
        Node head1 = new Node(6,head3,null);
        Node head = new Node(6,head1,head2);
        RemoveHalfNodes(head);
    }
    public static Node RemoveHalfNodes(Node root)
    {
        if(root==null)return root;
        if(root.left==null && root.right==null)return root;
        if(root.left !=null && root.right==null){
            return RemoveHalfNodes(root.left);
        }
        if(root.left ==null && root.right!=null){
            return  RemoveHalfNodes(root.right);
        }
        root.left =  RemoveHalfNodes(root.left);
        root.right =  RemoveHalfNodes(root.right);
        return root;
    }
}
