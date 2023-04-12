package medium;

public class ConstructTreefromInorderPreorder {
    public static Node buildTree(int inorder[], int preorder[], int n)
    {

        return ConstructTree(inorder,preorder,0,n-1,0,n-1);
    }
    static Node ConstructTree(int[] inorder, int[] preorder,int startIn, int endIn, int startPre, int endPre){
        if(startIn>endIn) return null;
        Node node = new Node(preorder[startPre]);
        int i=startIn;
        for(;i<endIn;i++){
            if(inorder[i] == preorder[startPre])
                break;
        }
        int leftEndIn =i-1;
        int	 rightStartIn = i+1;
        int leftStartpre = startPre+1;
        int  leftEndpre = startPre+1+ leftEndIn -startIn;
        int  rightstartPre = leftEndpre+1;
        node.right =  ConstructTree(inorder,preorder,rightStartIn,endIn,rightstartPre,endPre);
        node.left =  ConstructTree(inorder,preorder,startIn,leftEndIn,leftStartpre,leftEndpre);
        return node;
    }
}
