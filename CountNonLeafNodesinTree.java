public class CountNonLeafNodesinTree {
    int countNonLeafNodes(Node root) {
        if(root==null || root.left==null && root.right==null)return 0;
        return countNonLeafNodes(root.left) + countNonLeafNodes(root.right)+1;
    }
}
