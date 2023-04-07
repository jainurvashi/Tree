public class SumoftheLongestBloodlineofaTree {
    int ans =-1;
    int maxLevel =-1;
    public int sumOfLongRootToLeafPath(Node root)
    {
        if(root==null)return 0;
        height(root,0,0);
        return ans;
    }
    int height(Node root,int sum,int level){
        if(root==null)return 0;
        if(root.left==null && root.right==null){
            if(maxLevel<level){
                maxLevel =level;
                ans=sum+ root.data;
            }else if(maxLevel==level)
                ans=Math.max(ans,sum+ root.data);
        }
        return Math.max(height(root.left,sum+root.data,level+1), height(root.right,
                sum+root.data,level+1))+1;
    }
}
