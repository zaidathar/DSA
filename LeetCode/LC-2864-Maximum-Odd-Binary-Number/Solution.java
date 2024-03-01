class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int oneCnt= 0 ;
        for(int i = 0; i < len; i++){
            if(arr[i] == '1')oneCnt++;

        }
        arr[len - 1] = '1';
        oneCnt--;
        for(int i = 0 ; i < len-1 ; i++){
            if(oneCnt > 0){
                arr[i] = '1';
                oneCnt--;
            }
            else{
                arr[i] = '0';
            }
        
        }

        return new String(arr);
    }
}
