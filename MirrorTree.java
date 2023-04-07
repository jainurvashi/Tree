public class MirrorTree {
    void mirror(Node root) {
        if(root==null) return;
        switchVal (root);
        mirror(root.left);
        mirror(root.right);
    }

    void switchVal(Node root){
        if(root.left==null && root.right==null)return;
        Node temp = root.left;
        root.left=root.right;
        root.right = temp;
    }
}
