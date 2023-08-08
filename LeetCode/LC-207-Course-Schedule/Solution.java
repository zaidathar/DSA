class Solution {
    public boolean isCycleFound(int i,int[] vis ,ArrayList<ArrayList<Integer>> adj){
        if(vis[i]==2)return true;
        vis[i]=2;
        for(int c= 0;c<adj.get(i).size();c++){
            if(vis[adj.get(i).get(c)] != 1){
                if(isCycleFound(adj.get(i).get(c),vis,adj)){
                    return true;
                }
            }
            
        }
        vis[i]=1;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] vis = new int[numCourses];
        ArrayList<ArrayList<Integer>> adj = new ArrayList();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int[] arr : prerequisites){
            adj.get(arr[0]).add(arr[1]);
        }
        
        for(int i=0 ;i<numCourses;i++){
            if(vis[i]==0){
                if(isCycleFound(i,vis,adj)){
                    return false;
                }
            }
          
        }
        
        return true;
       
    }
}