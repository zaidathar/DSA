class Solution {
    public static boolean check(String s1, String s2, int i , boolean swap) {
        if(i > s1.length()-3 ) return false;
        if(s1.equals(s2))return true;
        
        if(swap){
            char[] ch1 = s2.toCharArray();
            char c = ch1[i];
            ch1[i] = ch1[i+2];
            ch1[i+2] = c;
            
            String t = new String(ch1);
            
            if(t.equals(s1))return true;
            s2 = t;
            
        }
        
        return check(s1,s2 , i+1 , true) || check(s1,s2 , i+1 , false);
    
    }
    public boolean canBeEqual(String s1, String s2) {
         boolean res = check(s1, s2,0 , true ) || check(s1, s2,0 , false );
        return res;
    }
}
