class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        for(int i = 0; i<num1.length ;i++){
            int flag = 0 , maxi =-1;
            for(int j =0 ;j< num2.length ; j++){
                if(num2[j]==num1[i])flag=1;
                if(flag==1 && num2[j] > num1[i]){
                    maxi =num2[j];
                    break;
                }
            }
            num1[i]=maxi;
        }
        return num1;
    }
}
