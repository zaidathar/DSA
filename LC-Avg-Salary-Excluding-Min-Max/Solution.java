class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i : salary){
            min = i < min ? i : min;
            max = i > max ? i : max;
            sum+=i;
        }
        sum -= (min + max);

        double res = (double)sum/(salary.length - 2);
        return res;
    }
}