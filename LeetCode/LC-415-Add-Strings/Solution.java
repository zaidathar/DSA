class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0 , sum =0 , digSum = 0 ;
        int len1 = num1.length()-1 , len2 = num2.length()-1;
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(true){
            if(len1 < 0 && len2 < 0)break;
            digSum += len1 >=0 ? num1.charAt(len1) - '0' : 0;
            digSum += len2 >=0 ? num2.charAt(len2) - '0' : 0;
            digSum += carry;
            carry = 0;
            if(digSum > 9){
                carry = digSum / 10;
                digSum%=10;
            }
            
            sum += digSum;
            arr.add(sum);
            digSum = sum = 0;
            len1--;len2--;
        }
        if(carry > 0)arr.add(carry);
        StringBuilder sb = new StringBuilder();
        for(int i = arr.size()-1 ; i>=0 ;i--){
            sb.append(arr.get(i));
        }
        return sb.toString();
    }
}
