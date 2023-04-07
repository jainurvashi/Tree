import java.util.ArrayList;

public class Kdistancefromroot {
    ArrayList<Integer> ans = new ArrayList();
    ArrayList<Integer> Kdistance(Node root, int k)
    {
        inorder(root,k,0);
        return ans;
    }
    void inorder(Node root, int k,int level){
        if(root==null)return;
        if(level==k)
            ans.add(root.data);
        inorder(root.left,k,level+1);
        inorder(root.right,k,level+1);

    }
}
