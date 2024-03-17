class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> finalInterval = new LinkedList<>();
        int index = 0 , len = intervals.length;

        while(index < len && intervals[index][1] < newInterval[0] ){
            finalInterval.add(intervals[index]);
            index++;
        }

        while(index < len && intervals[index][0] <= newInterval[1]){

            newInterval[0] = Math.min(intervals[index][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[index][1], newInterval[1]);
            index++;

        }

        finalInterval.add(newInterval);

        while(index < len){
            finalInterval.add(intervals[index]);
            index++;
        }


        return finalInterval.toArray(new int[finalInterval.size()][]);
    }
}
