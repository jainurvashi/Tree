package easy;

import java.util.*;

public class CheckiftwoNodesareCousins {
    //dfs way
  /*  static  public boolean isCousins(Node root, int a, int b) {
        List<Integer> aList = height(root, a, 0, new ArrayList<>());
        List<Integer> bList = height(root, b, 0, new ArrayList<>());
        if(aList.size()==0 || bList.size()==0 ) return false;
if(!Objects.equals(aList.get(1), bList.get(1)))
return false;
return !Objects.equals(aList.get(0), bList.get(0));

    }
    static  List<Integer> height(Node root, int a, int k,List<Integer>  hashMap){
        if(root==null)return hashMap;
        if(root.left!=null &&root.left.data == a || root.right!=null &&root.right.data == a){
            hashMap.add(root.data);
            hashMap.add(k+1);
            return hashMap;
        }
       hashMap.addAll(height(root.left,a,k+1,hashMap));
       hashMap.addAll(height(root.right,a,k+1,hashMap));
      return hashMap;

    }*/

    //bfs way
    public boolean isCousins(Node root, int a, int b) {
        if(root==null)return false;
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        int levelA = -1;
        int levelB = -1;
        int parentA = -1;
        int parantB=-1;
        int level =0;
        while(!queue.isEmpty()){
            int size = queue.size();
            level++;
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                if(current.left!=null) {
                    if(current.left.data == a){
                        levelA = level;
                        parentA = current.data;
                    }
                    if(current.left.data == b){
                        levelB = level;
                        parantB = current.data;
                    }
                    queue.offer(current.left);
                }
                if(current.right!=null) {
                    if(current.right.data == a){
                        levelA = level;
                        parentA = current.data;
                    }
                    if(current.right.data == b){
                        levelB = level;
                        parantB = current.data;
                    }
                    queue.offer(current.right);
                }
            }
        }
        return parentA != parantB && levelA == levelB;
    }

}
