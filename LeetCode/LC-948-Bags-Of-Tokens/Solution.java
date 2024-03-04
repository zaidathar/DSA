class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int res = 0 , maxRes = Integer.MIN_VALUE;

        Arrays.sort(tokens);

        int front = 0 , back = tokens.length-1;

        while(front <= back){
            if(power >= tokens[front]){
                power -= tokens[front];
                res++;
                front++;
            }
            else if(res > 0 ){
                power+=tokens[back];
                res--;
                back--;
            }
            else break;

            maxRes = Math.max(res,maxRes);
        }

        return Math.max(res,maxRes);
    }
}
