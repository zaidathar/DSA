class Solution {

    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascalTriangle = new ArrayList();


        for(int n = 1 ; n <= numRows ; n++ ){
            int ans = 1;
            List<Integer> row = new ArrayList();
            row.add(ans);
            for(int i = 1 ; i < n ; i++  ){
               ans = ans * (n-i);
               ans = ans/i;

               row.add(ans);
            }

            pascalTriangle.add(row);
        }
        return pascalTriangle;
    }
}
