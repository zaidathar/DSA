class Solution {
    public int trap(int[] height) {
        // first approach using extra space to track max in left and right
        int size = height.length;
        int[] maxL = new int[size];
        int[] maxR = new int[size];
        maxL[0] = height[0];
        maxR[size-1] = height[size-1];
        
        for(int i = 1;i<size;i++){
            if(height[i] >= maxL[i-1]){
                maxL[i] = height[i];
            }
            else{
                maxL[i]=maxL[i-1];
            }
        }
        for(int i = size-2 ;i>=0;i--){
            if(height[i] >= maxR[i+1]){
                maxR[i] = height[i];
            }
            else{
                maxR[i] = maxR[i+1];
            }
        }
        int res = 0;
        for(int i = 0;i<size;i++){
            res+=( Math.min(maxL[i],maxR[i])-height[i]);
        }
        return res;
    }
}
