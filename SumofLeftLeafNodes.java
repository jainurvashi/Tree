package easy;

public class SumofLeftLeafNodes {
    public static void main(String[] args) {
        Node head3 = new Node(19,null,null);
        Node head2 = new Node(17,null,null);
        Node head1 = new Node(18,head2,head3);
        Node head = new Node(1,null,head1);
        leftLeavesSum(head);
    }
    static   int sum =0;
    static  public int leftLeavesSum(Node root)
    {
        sum =0;
        if(root==null )return 0;
        leftSum(root,false);
        return sum;
    }
    static  void leftSum(Node root,boolean isLeft){
        if(root==null)return;
        if(root.left==null && root.right==null && isLeft){
            sum +=root.data;
        }
        leftSum(root.left,true);
        leftSum(root.right,false);

    }
}
