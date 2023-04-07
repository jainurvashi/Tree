public class CheckifTreeisIsomorphic {

    public static void main(String[] args) {

        Node head3 = new Node(4,null,null);
        Node head2 = new Node(3,null,null);
        Node head1 = new Node(2,head3,null);
        Node head = new Node(1,head1,head2);


        Node head32 = new Node(4,null,null);
        Node head22 = new Node(3,null,null);
        Node head12 = new Node(2,null,head32);
        Node head11 = new Node(1,head22,head12);
        isIsomorphic(head,head11);
    }
    static   boolean isIsomorphic(Node root1, Node root2)
    {
        if(root1==null && root2==null)return true;
        if(root1==null || root2==null ||  root1.data!=root2.data)return false;

        return isIsomorphic(root1.left,root2.right)&&isIsomorphic(root1.right,root2.left) ||
                isIsomorphic(root1.left,root2.left)&&isIsomorphic(root1.right,root2.right);
    }
}
