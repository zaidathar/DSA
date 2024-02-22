class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] counter = new int[n+1];
        int[] person = new int[n+1];
        for(int[] arr : trust){
            counter[arr[1]]++;
            person[arr[0]]++;
        }

        for(int i = 1; i <= n ; i++){
            if(counter[i] == n-1 && person[i] == 0 )
                return i;
        }

        return -1;
    }
}
