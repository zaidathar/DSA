class Solution {
    public int pivotInteger(int n) {
        int front  = 1 , back = n;

        int[] frontSum = new int[n+2];
        int[] backSum = new int[n+2];

        for(int i = 1 ; i <= n ; i++){
            frontSum[front] = frontSum[front-1] + front;
            backSum[back] = backSum[back+1] + back;

            front++;
            back--;
        }

        int res = -1;
        for(int i = 1 ; i <= n ; i++){
            if(frontSum[i] == backSum[i]){
                res = i;
                break;
            }
        }


        return res;
    }
}
