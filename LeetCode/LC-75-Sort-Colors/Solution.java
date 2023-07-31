class Solution {
    public void swap(int[] arr,int i , int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i]=temp;
    }
    public void sortColors(int[] nums) {
        int cnt0=0,cnt1=0,cnt2=0;
        for(int num : nums){
            if(num==0)cnt0++;
            else if(num==1)cnt1++;
            else cnt2++;
        }
        int i =0 ;
        while(i<nums.length){
            if(cnt0>0){
                nums[i]=0;
                cnt0--;
            }
            else if(cnt1 > 0){
                nums[i]=1;
                cnt1--;
            }
            else{
                nums[i]=2;
                cnt2--;
            }
            i++;
        }
    }
}