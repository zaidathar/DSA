class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int res = -1;
        if(nums1[len1 - 1] < nums2[0] || nums2[len2 -1 ] < nums1[0])
            return res;
        int i = 0 , j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                res = nums1[i];
                break;
            }

            if(nums1[i] < nums2[j])i++;
            else j++;
        }


        return res;
    }
}
