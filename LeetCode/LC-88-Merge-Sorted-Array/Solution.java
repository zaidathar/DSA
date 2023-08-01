class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = m+n-1;
        m--;n--;
        while(true){
           
            if(m>-1 && n>-1 && nums1[m] >= nums2[n]){
                nums1[lastIndex]=nums1[m];
                m--;
                lastIndex--;
            }
            else if(m>-1 && n>-1 && nums1[m] < nums2[n]){
                nums1[lastIndex]=nums2[n];
                n--;
                lastIndex--;
            }
            else if(m < 0){
                while(n>-1){
                    nums1[lastIndex]=nums2[n];
                    lastIndex--;
                    n--;
                }
                break;
                
            }
            else if(n < 0)break;
        }
    }
}