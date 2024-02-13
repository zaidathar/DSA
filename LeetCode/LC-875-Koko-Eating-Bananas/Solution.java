class Solution {

    public boolean isAbleToEat(int[] piles, int k, int h) {
        int res = 0, len = piles.length;
        for (int pile : piles) {
            if (res >= h)
                break;
            res += Math.ceil((double) pile / k);
            len--;
        }

        return res <= h && len == 0;
    }

    public int findMax(int[] piles) {
        int max = Integer.MIN_VALUE;

        for (int pile : piles)
            max = max < pile ? pile : max;
        return max;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = findMax(piles);
        int res = Integer.MAX_VALUE;
        while (l <= r) {
            int mid = (l + r) / 2;

            boolean check = isAbleToEat(piles, mid, h);

            if (check) {
                r = mid - 1;
                res = mid < res ? mid : res;
            } else
                l = mid + 1;
        }

        return res;

    }
}
