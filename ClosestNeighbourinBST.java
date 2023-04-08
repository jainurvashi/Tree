package easy;
/*Given a binary search tree and a number N, find the greatest number in the binary search tree that is less than or equal to N*/
public class ClosestNeighbourinBST {
    static int max =0;
    public static int findMaxForN(Node node, int val)
    {
        max=0;
        findVal(node,val);
        return max;
    }
    static void findVal(Node node, int val){
        if(node==null)return;
        if(node.data==val){
            max =node.data;
            return;
        }
        if(node.data<val){
            max =Math.max(max,node.data);
            findVal(node.right,val);
        }  else{
            findVal(node.left,val);
        }
    }
}
