public class KthlargestelementinBST {
    int ans =0;
    int n =0;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {

        traverse(root,K);
        return ans;
    }
    void traverse(Node root,int k){
        if(root==null)return;
        traverse(root.right,k);

        n++;
        if(n==k)
        {
            ans = root.data;

        }
        traverse(root.left,k);
    }
}
