class Solution {

    public int addDigits(int num) {
        while(num > 9){
            String strOfNum = String.valueOf(num);
            int tempNum  = 0;
            for(int i = 0; i<strOfNum.length();i++){
                tempNum += (strOfNum.charAt(i) - '0');
            }

            num = tempNum;
        }

        return num;
    }
}
