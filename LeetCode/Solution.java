class Solution {
    public String convertToTitle(int columnNumber) {
        char A = 'A';
        ArrayList<Character> cArr = new ArrayList<>();
        while(columnNumber > 0){
            int mod = columnNumber % 26 ;
            mod = mod == 0 ? 26 :mod;
            cArr.add(Character.valueOf((char)(A+mod-1)));
            columnNumber -= (mod==0 ? 1 :mod);
            columnNumber /= 26;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = cArr.size()-1 ; i>=0 ;i--){
            sb.append(cArr.get(i));
        }
        return sb.toString();
    }
}