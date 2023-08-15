class Solution {
    public int longestPalindrome(String s) {
        Map<Character , Integer> mp = new HashMap<>();
        
        for(int i =0 ;i< s.length();i++){
            Integer val = mp.get(s.charAt(i));
            mp.put(s.charAt(i), val==null ? 1 : val+1);
        }
        
        int len = 0 , oddCnt = 0;
        
        for(Map.Entry m : mp.entrySet()){
            int cnt = (int) m.getValue();
            if(cnt%2!=0)oddCnt++;
            len+=(cnt - cnt%2);
        }
        if(oddCnt>0)len++;
        return len;
    }
}
