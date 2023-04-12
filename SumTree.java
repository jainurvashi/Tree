package medium;

public class SumTree {
    boolean isSum = true;
    boolean isSumTree(Node root)
    {
        sum(root);
        return isSum;

    }

    int sum (Node root){
        if(root==null) return 0;
        int left =sum(root.left);
        int right =sum(root.right);
        if(root.left==null && root.right==null) {
            return root.data;
        }
        if(left + right!=root.data){
            isSum = false;
        }
        return left+right+root.data;
    }
}
