class Solution {
    public String mergeAlternately(String word1, String word2) {
        return approach2(word1,word2);
    }

    private String approach2(String word1, String word2){
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder sb = new StringBuilder();

        int i = 0 , j =0;

        while(true){
            if(i >= len1 && j >= len2)break;
            if(i < len1) sb.append(word1.charAt(i));
            if(j < len2)  sb.append(word2.charAt(j));
            i++;
            j++;
        }

        return sb.toString();

    }

    private String approach1(String word1, String word2){
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder sb = new StringBuilder();
        int i = 0 ,j =0 , loop = 0;
        while(true){
            if(i >= len1 && j >= len2)break;
            if(loop % 2 == 0){
                loop++;
                if( i>= len1)continue;
                sb.append(word1.charAt(i));
                i++;
            }
            else{
                loop++;
                if(j>= len2)continue;
                sb.append(word2.charAt(j));
                j++;
            }
        }

        return sb.toString();
    }
}
