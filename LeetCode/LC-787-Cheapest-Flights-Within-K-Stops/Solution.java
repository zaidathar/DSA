class Solution {
    private static final int MAX = Integer.MAX_VALUE;
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] prices = new int[n];
        Arrays.fill(prices, MAX);
        prices[src] = 0;

        for(int i = 0 ; i<= k ; i++){
            int[] tempPrice = Arrays.copyOf(prices, prices.length);
            for(int[] detail : flights){
                int source = detail[0], dest = detail[1], charge = detail[2];
                if(prices[source] == MAX)continue;
                int currAmount = prices[source] + charge;
                if( currAmount < tempPrice[dest])
                    tempPrice[dest] = currAmount;
                
            }
            
            prices = tempPrice;
        }


        return prices[dst] != MAX ? prices[dst] : -1;
    }
}
