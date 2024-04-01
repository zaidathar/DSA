class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        
        int back = len-1, result = 0;
        
        boolean isTrailSpace = s.charAt(back) == ' ' ? true : false;
        
        while(back >= 0){
            
            if(s.charAt(back) == ' ' && !isTrailSpace){
                break;
            }
            
            if(s.charAt(back) != ' '){
                result++;
                isTrailSpace = false;
    
            }
                
            
            back--;
        }
        
        return result;
    }
}
