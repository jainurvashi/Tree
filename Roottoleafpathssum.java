public class Roottoleafpathssum {
    static long ans =0;
    public static long treePathsSum(Node root)
    {
        ans =0;
        if(root==null)return 0;
        findSum(root,0);
        return ans;
    }
    static void findSum(Node root,int sum){
        if(root==null)return;
        if(root.left==null && root.right==null){
            ans+=sum*10+root.data;
        }
        findSum(root.left,sum*10+root.data);
        findSum(root.right,sum*10+root.data);
    }
}
