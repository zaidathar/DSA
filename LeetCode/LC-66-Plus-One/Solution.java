class Solution {
    public int[] plusOne(int[] digits) {
        int j = digits.length-1;
        int carry = 1;
        while(j>=0){
            int dig = digits[j];
            dig = dig+carry;
            carry = dig/10;
            dig%=10;
            digits[j] = dig;
            if(carry==0)break;
            j--;
        }
        
        if(carry > 0){
            int[] res = new int[digits.length+1];
            res[0] = carry;
            
            for(int i = 1 ;i<res.length;i++){
                res[i] = digits[i-1];
            }
            return res;
        }
        
        return digits;
    }
}
