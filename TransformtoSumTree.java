public class TransformtoSumTree {
    public void toSumTree(Node root){
        postOrder(root);

    }
    int postOrder(Node root){
        if(root==null)return 0;
        int right = postOrder(root.right);
        int left=  postOrder(root.left);
        int rootVal = root.data;
        root.data = left+right;
        int sum = left+right+rootVal;
        return sum;
    }
}
