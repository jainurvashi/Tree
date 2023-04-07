public class LowestCommonAncestorinaBST {
    Node LCA(Node root, int n1, int n2)
    {
        if(root == null) return root;
        int max = Math.max(n1,n2);
        int min = Math.min(n1,n2);
        if(min<=root.data && root.data<=max)
            return root;
        else if(min<root.data && root.data>max)
            return LCA(root.left,n1,n2);
        else
            return LCA(root.right,n1,n2);
    }
}
