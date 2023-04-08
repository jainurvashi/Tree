package easy;

public class Depthofnode {
    public static void main(String[] args) {
        //7 6 8 2 N N 9 1 5 N 10 N N 3 N N N N 4

        Node head5 = new Node(4,null,null);
        Node head4 = new Node(3,null,head5);
        Node head3 = new Node(10,null,null);
        Node head2 = new Node(5,head4,null);
        Node head1 = new Node(1,null,null);
        Node head = new Node(9,null,head3);
        Node head32 = new Node(2,head1,head2);
        Node head22 = new Node(8,null,head);
        Node head12 = new Node(6,head32,null);
        Node head11 = new Node(7,head12,head22);
        depthOfOddLeaf(head11);
    }
    static int maxlevel=0;
    public static int depthOfOddLeaf(Node root)
    {
        maxDepth(root,1);

        return maxlevel;
    }
    public static void maxDepth(Node root,int level) {
        if(root==null)return;
        if(root.left==null && root.right==null){
            if(level%2!=0){
                maxlevel = Math.max(maxlevel,level);
            }
        }
        maxDepth(root.left,level+1);
        maxDepth(root.right,level+1);
    }
}
