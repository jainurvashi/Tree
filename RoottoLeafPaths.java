import java.util.ArrayList;

public class RoottoLeafPaths {
    public static void main(String[] args) {

        Node head2 = new Node(3,null,null);
        Node head1 = new Node(2,null,null);
        Node head = new Node(1,head1,head2);
        Paths(head);
    }
    static  ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    static  public ArrayList<ArrayList<Integer>> Paths(Node root){
        if(root==null) return ans;
        ArrayList<Integer> value = new ArrayList<Integer>();
        findPath(root,value);
        return ans;
    }
    static void findPath(Node root,ArrayList<Integer> value){
        if(root==null) return;
        value.add(root.data);
        if(root.left==null && root.right==null)
        {
            ans.add(value);

        }
        findPath(root.left,value);
        findPath(root.right,value);
    }
}
