class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int len1 = nums1.length , len2 = nums2.length;
        
        int[][] track = new int[len1+1][len2+1];

        for(int i = 1;i <= len1;i++){
            for(int j = 1;j<=len2;j++){
                if(nums1[i-1]== nums2[j-1]){
                    track[i][j] = 1+track[i-1][j-1];
                }
                else{
                    track[i][j] = Math.max(track[i][j-1],track[i-1][j]);
                }
            }
        }

        return track[len1][len2];
    }
}
