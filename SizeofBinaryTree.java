public class SizeofBinaryTree {
    static int ans =0;
    public static void main(String[] args) {
        Node head4 = new Node(11,null,null);
        Node head5 = new Node(13,null,null);
        Node head3 = new Node(11,null,null);
        Node head2 = new Node(8,head3,head5);
        Node head1 = new Node(10,null,head4);
        Node head = new Node(19,head1,head2);
        getSize(head);
    }

	public static int getSize(Node root)
	{
	    if(root==null)
            return 0;
        return getSize(root.left)+getSize(root.right)+1;
    }
 /*   static ans =0;
 public static int getSize(Node root)
    {
        traverse(root);
        return ans;
    }
    static void traverse(Node root){
        if(root==null){
            return;
        }
        traverse(root.left);
        traverse(root.right);
        ans++;
    }*/
}
