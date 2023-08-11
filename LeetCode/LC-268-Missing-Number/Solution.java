class Solution {
    public int missingNumber(int[] nums) {
        int[] vis = new int[nums.length+1];
        int res = 0;
        for(int i :nums)vis[i]=1;
        for(int i = 0;i<vis.length;i++){
            if(vis[i]==0){
                res=i;
                break;
            }
        }
        return res;
    }
}