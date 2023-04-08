package easy;

public class TransformtoSumTree {


    //10 -2 6 8 -4 7 5
    public static void main(String[] args) {
        Node head6 = new Node(5,null,null);
        Node head5 = new Node(7,null,null);
        Node head4 = new Node(-4,null,null);
        Node head3 = new Node(8,null,null);
        Node head2 = new Node(6,head5,head6);
        Node head1 = new Node(-2,head3,head4);
        Node head = new Node(10,head1,head2);
        toSumTree(head);
    }
    static public void toSumTree(Node root){
        calculateNode(root);

    }
    static  int calculateNode(Node root){
        if(root==null)return 0;
        int left = calculateNode(root.left);
        int right = calculateNode(root.right);

        if(root.left==null && root.right==null) {
            int data = root.data;
            root.data = 0;
            return data;
        }
        int data = root.data;
        root.data = left+right;

        return left+right+data;
    }
}
