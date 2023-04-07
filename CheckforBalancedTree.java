public class CheckforBalancedTree {

    boolean ans = true;
    boolean isBalanced(Node root)
    {
        inorder(root,0);
        return ans;
    }
    void inorder(Node root,int d){
        if(root==null)return;
        if(Math.abs(getHeight(root.left)-getHeight(root.right))>1){
            ans = false;
        }
        inorder(root.left,d+1);
        inorder(root.right,d+1);
    }
    int getHeight(Node root){
        if(root==null)return 0;
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
}
