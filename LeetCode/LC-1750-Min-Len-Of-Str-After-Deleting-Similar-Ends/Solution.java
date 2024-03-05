class Solution {
    public int minimumLength(String s) {
        int f = 0 , b = s.length()-1;
        char[] chars = s.toCharArray();
        while(f < b ){
            if(chars[f]!=chars[b])break;
            
            char ch = chars[f];

            while(b >= f && chars[f]==ch)f++;
            while(b >= f && chars[b]==ch)b--;
            
        }

        return b - f +1;
    }
}
