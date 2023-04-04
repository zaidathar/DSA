class Solution {
    public int partitionString(String s) {
        Set<Character> set = new HashSet<Character>();
        int cnt = 1;
        for(char i : s.toCharArray()){
            if(set.contains(i) ){
                cnt++;
                set.clear();
            }
            set.add(i);
        }
        return cnt;
        
    }

    // Refer this solution
    public int optimalPartitionString(String s){
        int map = 0;
        int count = 1;
        for(char c : s.toCharArray()){
            if((map & (1<<c)) != 0) {
                count++;
                map = 0;
            }
            map ^= (1<<c);
        }
        return count;
    }
}