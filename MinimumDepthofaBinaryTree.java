public class MinimumDepthofaBinaryTree {
    int minDepth(Node root)
    {
        if(root==null )return 0;
        else if(root.left==null && root.right==null)return 1;
        else if( root.left!=null && root.right==null)    return 1+minDepth(root.left);
        else  if(root.left == null)    return 1+minDepth(root.right);
        else return Math.min(minDepth(root.left),minDepth(root.right))+1;

    }
}
