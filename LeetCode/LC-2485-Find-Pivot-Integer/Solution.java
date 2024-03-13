class Solution {
    public int pivotInteger(int n) {
        int sum = n*(n+1)/2;
        int target = (int)Math.sqrt(sum);

        return target*target == sum ? target : -1;
    }
}
