import java.util.Arrays;

public class CheckforBST {
    Node prev =null;
    boolean ans = true;
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        if(root==null) return true;
        traverse(root);
        return ans;
    }
    void traverse(Node root){
        if(root==null) return;
        traverse(root.right);
        if(prev != null && prev.data<=root.data){
            ans = false;
            return;
        }
        prev = root;
        traverse(root.left);
    }
}
