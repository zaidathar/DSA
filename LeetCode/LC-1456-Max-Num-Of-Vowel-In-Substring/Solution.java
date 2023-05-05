class Solution {
    public int maxVowels(String s, int k) {
        List<Character> vowel = Arrays.asList('a','e','i','o','u');
        int res = 0 ,count =0;
        int ind = 0 , n = s.length();
        for(;ind<k;ind++){
          if(vowel.contains(s.charAt(ind)))count++;
        }
        res = count;

        for(;ind < n ;ind++){
          if(vowel.contains(s.charAt(ind)))count++;
          if(vowel.contains(s.charAt(ind-k)))count--;
          res = Math.max(res,count);
        }

        return res;
    }
}