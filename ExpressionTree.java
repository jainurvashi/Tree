package easy;
class NodeString
{
    String data;
    NodeString left,right;

    NodeString(String data,NodeString lft, NodeString rght)
    {
        this.data = data;
        this.left = lft;
        this.right = rght;
    }
}
public class ExpressionTree {

    public int evalTree(NodeString root) {
        if(root==null) return 0;
        int left =evalTree(root.left);
        int right =evalTree(root.right);
        if(root.data.equals("+"))return left+right;
        if(root.data.equals("-"))return left-right;
        if(root.data.equals("*"))return left*right;
        if(root.data.equals("/"))return left/right;
        return Integer.parseInt(root.data);
    }

}
