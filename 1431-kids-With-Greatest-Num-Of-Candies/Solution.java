class Solution {
    private int maxInCandies(int[] candies){
        int max = Integer.MIN_VALUE;

        for(int candy: candies)max = max < candy ? candy : max;

        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = maxInCandies(candies);
        List<Boolean> result = new ArrayList<>();

        for(int candy : candies){
            result.add(maxValue > candy + extraCandies ? false : true);
        }

        return result;
    }
}
