// only 1 case failed
//left =  1073741824  right = 2147483647
class TLESolution {
    public int calculateAnd(long left, long right){
        long res = left;

        for(long i= left +1 ; i<= right; i++){
            res &= i;
            System.out.println("res "+res);
        }
        return (int)res;
    }
    public int rangeBitwiseAnd(int left, int right) {
        // if any number in between range in power of 2 then I will give 0
        // find the nearest pow of 2 from left and right
        
        long nearestPowOf2 = Long.highestOneBit((long)left) << 1;
        System.out.println("Pow "+nearestPowOf2);
        if(nearestPowOf2 <= right)
            return 0;
        
        return (int)calculateAnd((long)left, (long)right);

    }
}
