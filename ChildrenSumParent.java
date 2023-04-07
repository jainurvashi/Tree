public class ChildrenSumParent {
    public static int isSumProperty(Node root)
    {
        if(root==null || root.left==null && root.right==null)return 1;
        int data =0;
        if(root.left!=null)
            data+=root.left.data;
        if(root.right!=null)
            data+=root.right.data;
        if(data!=root.data)return 0;
        return (isSumProperty(root.left) + isSumProperty(root.right) )==2?1:0;

    }
}
