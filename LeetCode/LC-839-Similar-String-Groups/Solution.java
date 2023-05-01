class Solution {
    public int numSimilarGroups(String[] strs) {
        int len = strs.length;
        if( len== 0){
            return 0;
        }

        boolean[] visited = new boolean[len];
        int res = 0 ;
        for(int i = 0 ; i < len ; i++){
            if(visited[i]) continue;
            res++;
            dfs(strs , i , visited);
            
        }
        return res;
    }

    private void dfs(String[] strs, int ind, boolean[] visited) {
        visited[ind] = true;
        for (int i = 0; i < strs.length; i++) {
            if (visited[i])
                continue;
            if (isSimilar(strs[ind], strs[i]))
                dfs(strs, i, visited);
        }
    }
    private boolean isSimilar(String s1, String s2) {
        int notMatch = 0;
        for (int i = 0;i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                notMatch++;
        }
        return (notMatch == 0) || (notMatch == 2);
    }
}