package easy;
/*Given a Binary Tree of size N, your task is to complete the function rightLeafSum(), which should return the sum of all
the leaf nodes that are the right child of their parent of the given binary tree.*/
public class SumofRightLeafNodes {
    int sum =0;
    int rightLeafSum(Node root)
    {
        rightSum(root,false);
        return sum;

    }
    void  rightSum(Node root,boolean isRight){
        if(root ==null)return;
        if(root.left==null && root.right==null && isRight)
            sum +=root.data;
        rightSum(root.left,false);
        rightSum(root.right,true);
    }
}
