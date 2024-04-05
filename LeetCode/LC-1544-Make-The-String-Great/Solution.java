class Solution {
    public String makeGood(String s) {
        
        List<Character> stack = new ArrayList();
        
        int i = 0 , len = s.length();
        
        while( i < len ){
            int lastInd = stack.size() - 1;
            if(!stack.isEmpty() && 
               stack.get(lastInd) != s.charAt(i) && 
               lower(stack.get(lastInd)) == lower(s.charAt(i))
                   
              ){
                stack.remove(lastInd);
            }
            
            else{
                stack.add(s.charAt(i));
            }
            
            i++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(Character c : stack)sb.append(c);
        
        return sb.toString();
    }
    
    private Character lower(Character  c){
        return Character.toLowerCase(c);
    }
}
