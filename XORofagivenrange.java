package easy;
/*You are given an array nums. Your task is to complete the function getXor to return the XOR of the given range a and b.*/
public class XORofagivenrange {
    public int getXor(int[] nums, int a, int b){
        if(nums.length==0|| nums.length<b) return 0;
        int ans = nums[a];
        for(int i=a+1;i<=b;i++){
            ans ^=nums[i];
        }
        return ans;
    }
}
