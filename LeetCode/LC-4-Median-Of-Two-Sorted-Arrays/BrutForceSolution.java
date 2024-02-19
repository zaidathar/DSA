class BruteForceSolution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;
        boolean isEvenLen = totalLen % 2 == 0;
        int first = 0 , second = 0, common = 1, median = 0;
        int mid =  isEvenLen ? (int)totalLen/2  : (int)totalLen/2 + 1 ;
        int nextToMid = isEvenLen ? mid + 1 : mid;

        while(common <= nextToMid ){
            int firstVal = first < nums1.length ? nums1[first] : Integer.MAX_VALUE;
            int secondVal = second < nums2.length ? nums2[second] : Integer.MAX_VALUE;
            // System.out.println("Common "+common+" mid "+mid+" nextToMid "+nextToMid);
            // System.out.println("first "+first+" second "+second);

            if(firstVal <= secondVal){
                if( common == mid){
                    median += nums1[first];
                }
                else if(isEvenLen && common == nextToMid){
                    median += nums1[first];
                }

                first++;
            }
            else{
                if( common == mid){
                    median += nums2[second];
                }
                else if(isEvenLen && common == nextToMid){
                    median += nums2[second];
                }

                second++;
            }

            common++;

            
        }

        // System.out.println("Median "+median);

        return totalLen % 2 == 0 ? median/2.0 : median/1.0;

    }
}
