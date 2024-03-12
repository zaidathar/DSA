class Solution {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];
        
        for(char c: s.toCharArray()){
            freq[c -'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(char c : order.toCharArray() ){
            int f = freq[c -'a'];

            if(f == 0 )continue;

            while(freq[c-'a']-- > 0){
                sb.append(c);
            }
        }

        for(int i = 0 ; i < 26 ; i++){
            char c  = (char) ('a' + i);
            while(freq[i]-- > 0 ){
                sb.append(c);
            }

        }

        return sb.toString();
    }
}
