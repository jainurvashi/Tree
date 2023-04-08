package easy;

import java.util.ArrayList;
import java.util.Collections;

public class Leafunderbudget {
    public static void main(String[] args) {
        Node head1 = new Node(5,null,null);
        Node head = new Node(12,null,null);
        Node head32 = new Node(7,head1,null);
        Node head22 = new Node(9,head32,head);
        Node head12 = new Node(1,null,null);
        Node head11 = new Node(2,head12,head22);
        getCount(head11,9);

    }
    static  public int getCount(Node node, int bud)
    {
        ArrayList<Integer> arrayList = new ArrayList();
        maxLevel(node,1,arrayList);
        Collections.sort(arrayList);
        int maxLevel =0;
        for(int i : arrayList){
            if((bud-i)>=0){
                maxLevel++;
                bud = bud-i;
            }else{
                return maxLevel;
            }
        }
        return maxLevel;
    }
    static  void maxLevel(Node node,int level, ArrayList<Integer> arrayList){
        if(node==null)return;
        if(node.left==null && node.right==null)
            arrayList.add(level);
        maxLevel(node.left,level+1,arrayList);
        maxLevel(node.right,level+1,arrayList);

    }
}
