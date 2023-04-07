public class CountLeavesinBinaryTree {
    int ans =0;
    int countLeaves(Node node)
    {
        traverse(node);
        return ans;
    }
    void traverse(Node root){
        if(root == null) return;
        if(root.left==null && root.right==null){
            ans++;
        }
        traverse(root.left);
        traverse(root.right);
    }
}
