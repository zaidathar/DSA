class SetBitSolution {
    public int countSetBit(int n ){
        if(n == 0)return 0;

        return (n & 1) + countSetBit(n >> 1);
    }
    public boolean isPowerOfTwo(int n) {
        if( n <= 0) return false;
        int setBitCount = countSetBit(n);

        return setBitCount == 1 ? true : false;
    }
}
