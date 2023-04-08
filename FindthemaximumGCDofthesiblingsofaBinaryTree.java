package easy;

public class FindthemaximumGCDofthesiblingsofaBinaryTree {
    //4 5 2 N N 3 1 6 12
    public static void main(String[] args) {
        Node head6 = new Node(12,null,null);
        Node head5 = new Node(6,null,null);
        Node head4 = new Node(1,null,null);
        Node head3 = new Node(3,head5,head6);
        Node head2 = new Node(2,head3,head4);
        Node head1 = new Node(5,null,null);
        Node head = new Node(4,head1,head2);
        maxGCD(head);
    }
    static  int max =0;
    static   int maxGCD(Node root) {
        if(root==null)return 0;
        if(root.left==null && root.right==null) return 0;
        if(root.right.data%root.left.data==0){
            max = root.data;
            return max;
        }
        return Math.max(maxGCD(root.left),maxGCD(root.right));
    }
}
