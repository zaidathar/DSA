class Solution {
    public int moduloMultiplication(int a , int b ,int mod){
        int res = 0 ;
        a%=mod;
        while(b >0){
            if((b&1) > 0){
                res = (res + a)%mod;
            }
            a =(2 * a)%mod;
            b >>=1;
        }
        return res;
    }
    public int maxArea(int h, int w, int[] hCuts, int[] vCuts) {
        Arrays.sort(hCuts);
        Arrays.sort(vCuts);
        
        int mod  = 1000000007;
        int hmax =  hCuts[0], wmax = vCuts[0];
        
        for(int i =1 ;i < hCuts.length ; i++){
           int distance = Math.abs(hCuts[i] - hCuts[i-1])%mod;
            hmax = hmax < distance ? distance : hmax;
        }
        int lastCutDistance = h - hCuts[hCuts.length -1];
        hmax = hmax < lastCutDistance ? lastCutDistance%mod : hmax;
        
        for(int i =1 ;i < vCuts.length ; i++){
           int distance = Math.abs(vCuts[i] - vCuts[i-1])%mod;
            wmax = wmax < distance ? distance : wmax;
        }
        lastCutDistance = w - vCuts[vCuts.length -1];
        wmax = wmax < lastCutDistance ? lastCutDistance%mod : wmax;
        
        return moduloMultiplication(hmax ,wmax , mod);
    }
}