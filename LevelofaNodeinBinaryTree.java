package easy;
/*Given a Binary Tree and a target key you need to find the level of target key in the given Binary Tree.*/
public class LevelofaNodeinBinaryTree {
    int maxLevel=0;
    int getLevel(Node node, int data)
    {
        maxLevel=0;
        findMatchLevel(node,data,1);
        return maxLevel;
    }
    void findMatchLevel(Node node, int data,int level){
        if(node==null)return;
        if(node.data == data)
            maxLevel=level;
        findMatchLevel(node.left,data,level+1);
        findMatchLevel(node.right,data,level+1);
    }
}
