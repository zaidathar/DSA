class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i =0 ;i<numRows;i++){
            List<Integer> temp = new ArrayList<Integer>();
            for(int j = 0 ; j<i+1;j++){
                if(j==0 || j==i)temp.add(1);
                else temp.add(0);
            }
            res.add(temp);
        }
        
        for(int i = 0 ; i<numRows ; i++){
            
            for(int j =0 ; j<i;j++){
                if(j==0 || j==i)continue;
                int sum = res.get(i-1).get(j)+res.get(i-1).get(j-1);
                res.get(i).set(j,sum);
            }
        }
        return res;
    }
}
