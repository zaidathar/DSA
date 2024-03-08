class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];

        int MAX = Integer.MIN_VALUE;

        for(int i : nums){
            count[i]++;
            MAX = Math.max(count[i],MAX);
        }

        int res = 0 ;

        for(int cnt  : count ){
            if(cnt == MAX)res+=MAX;
        }

        return res;
    }
}
