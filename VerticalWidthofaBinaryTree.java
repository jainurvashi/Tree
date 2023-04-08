package easy;

public class VerticalWidthofaBinaryTree {
    public static void main(String[] args) {
        //1 2 3 4 5 6 7 N N N N N 8 N 9
        Node head8 = new Node(9,null,null);
        Node head7 = new Node(8,null,head8);
        Node head6 = new Node(7,null,null);
        Node head5 = new Node(6,null,head7);
        Node head4 = new Node(5,null,null);
        Node head3 = new Node(4,null,null);
        Node head2 = new Node(3,head5,head6);
        Node head1 = new Node(2,head3,head4);
        Node head = new Node(1,head1,head2);
        verticalWidth(head);
    }
    public static int verticalWidth(Node root)
    {
        int ans =1;
        if(root==null)return 0;
        ans +=countleft(root.left,0)+countRight(root.right,0);
        return ans;
    }
    static	int countleft(Node root,int ans){
        if(root==null)return ans;
        return countleft(root.left,ans+1);
    }
    static	int countRight(Node root,int ans){
        if(root==null)return ans;
        return countRight(root.right,ans+1);
    }
}
