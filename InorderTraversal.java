import java.util.ArrayList;

public class InorderTraversal {
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList();
        inOrderTraverse(root,ans);
        return ans;
    }
    void  inOrderTraverse(Node root,  ArrayList<Integer> ans){
        if(root==null) return;
        inOrderTraverse(root.left,ans);
        ans.add(root.data);
        inOrderTraverse(root.right,ans);
    }
}
