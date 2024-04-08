class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int oneCnt = 0 , zeroCnt = 0 ;

        for(int desired : students){
            oneCnt = desired == 1 ? oneCnt+1 : oneCnt;
            zeroCnt = desired == 0 ? zeroCnt + 1 : zeroCnt ;
        }

        for(int sandwich : sandwiches){
            if(sandwich == 0){
                if(zeroCnt == 0)return oneCnt;
                zeroCnt--;
            }
            else{
                if(oneCnt == 0 )return zeroCnt;
                oneCnt--;
            }
        }

        return 0;
    }
}
