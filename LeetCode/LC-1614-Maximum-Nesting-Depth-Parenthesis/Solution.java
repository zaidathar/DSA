class Solution {
    public int maxDepth(String s) {
        if(s.length() == 0 )return 0;
        
        
        int maxDepth = 0, currDepth = 0;
        
        for(char c : s.toCharArray()){
            if(c == '(' ){
                currDepth++;
                maxDepth = Math.max(maxDepth, currDepth);
            }
            else if(c == ')')
                currDepth--;
        }
        
        return maxDepth;
    }
}
