class Solution {
    int track[][];
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        track = new int[piles.size()+1][k+1];
        return dfs(0,k,piles);
    }

    public int dfs(int val ,int k,List<List<Integer>> piles){
        int size = piles.size();
        if( val == size)return 0;

        if(track[val][k] > 0)return track[val][k];

        track[val][k] = dfs(val+1, k , piles);

        int cp = 0;
        int range = Math.min(k , piles.get(val).size());
        for (int j = 0; j < range ;j++){
            cp += piles.get(val).get(j);
            track[val][k] = Math.max(track[val][k] , cp + dfs(val + 1, k - j - 1,piles));
        }

        return track[val][k];
    }
}
