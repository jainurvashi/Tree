package easy;

import java.util.ArrayList;

public class PostordertraversalfromgivenInorderandPreordertraversals {


    ArrayList<Integer> ans = new ArrayList();
    void printPostOrder(int in[], int pre[], int n)
    {
        if(n==0)return;
        postOrder(in,pre,0,n-1,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(ans.get(i) +" ");
        }
    }
    void postOrder (int in[], int pre[],int startIn,int endIn, int startPre,int endPre){
        if(startIn>endIn) return;
        ans.add(0,pre[startPre]);
        int i=startIn;
        for(;i<endIn;i++){
            if(pre[startPre]==in[i]){
                break;
            }
        }
        int leftEndIn =i-1;
        int	 rightStartIn = i+1;
        int leftStartpre = startPre+1;
        int  leftEndpre = startPre+1+ leftEndIn -startIn;
        int  rightstartPre = leftEndpre+1;
        postOrder(in,pre,rightStartIn,endIn,rightstartPre,endPre);
        postOrder(in,pre,startIn,leftEndIn,leftStartpre,leftEndpre);

    }
}
