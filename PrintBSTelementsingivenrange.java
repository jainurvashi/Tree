package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintBSTelementsingivenrange {
    public static void main(String[] args) {


        shortestPath(3,1,2);
    }


    static List<Integer> ans = new ArrayList();
    public static List<Integer> shortestPath(int N, int X, int Y) {
        HashMap<Integer,List<Integer>> hashMap = new HashMap();
        Boolean[] visit = new Boolean[N+1];
        Arrays.fill(visit,false);
        ans.add(0);
        for(int i=1;i<=N;i++){
            ans.add(0);
            if(i<N)
            hashMap.computeIfAbsent(i, var->new ArrayList()).add(i+1);
            else
            if(i==X){
                hashMap.computeIfAbsent(i, var->new ArrayList()).add(Y);
            }

        }
        for(int i=1;i<=N;i++){
            dfs(hashMap,visit,i,0);
        }
        return ans;
    }
    static  void dfs(HashMap<Integer,List<Integer>> hashMap,Boolean[] visit,int i,int level){
        ans.set(level, ans.get(level)+1);
        visit[i] = true;
        for(int a : hashMap.get(i)){
            if(!visit[a]){
                dfs(hashMap,visit,a,level+1);
            }
        }
    }

}
