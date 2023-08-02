class Solution {
    public int candy(int[] ratings) {
        int cnt = 0 , len = ratings.length ;
        if(len<2)return len;
        int[] candyArr = new int[len];
        Arrays.fill(candyArr,1);
        for(int i =1  ;i< len;i++){
            if(ratings[i] > ratings[i-1]){
                candyArr[i] = candyArr[i-1]+1;
            }
        }
        for(int i = len -1;i>0;i--){
            if(ratings[i-1] > ratings[i] ){
                candyArr[i-1] = Math.max(candyArr[i]+1 , candyArr[i-1]);
                
            }
        }
        for(int c : candyArr)cnt+=c;
        return cnt;
    }
}