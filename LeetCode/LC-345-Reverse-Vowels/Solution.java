class Solution {
    public boolean isVowel(char c){
        char[] vowel = {'a','e','i','o','u','A','E','I','O','U'};
        for(char i : vowel){
            if(i==c)return true;
        }
        return false;
    }
    
    public String reverseVowels(String s) {
        int i = 0, j=s.length()-1;
        int[] track = new int[s.length()];
        while(i<=j){
            boolean f1 = true,f2 = true;
            if(!isVowel(s.charAt(i)))f1 = false;
            
            if(!isVowel(s.charAt(j)))f2=false;
           
            if(f1 && f2){
                
                track[i]=j;
                track[j]=i;
                i++;j--;
                
            }
            else{
                track[i]=i;
                track[j]=j;
            }
            i = f1 == true ? i : i+1;
            j = f2 == true ? j : j-1;
            
        }
        
        StringBuilder sb = new StringBuilder();
        for(int t : track){
            sb.append(s.charAt(t));
        }
        
        return sb.toString();
    }
}
