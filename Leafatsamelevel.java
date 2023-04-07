public class Leafatsamelevel {
    boolean ans = true;
    int level=-1;
    boolean check(Node root)
    {
        inoredr(root,0);
        return ans;
    }
    void inoredr(Node root,int d){
        if(root==null) return;
        if(root.left==null && root.right==null)
            if(level==-1)level = d;
            else if(level!=d) ans = false;
        inoredr(root.left,d+1);
        inoredr(root.right,d+1);
    }
}
