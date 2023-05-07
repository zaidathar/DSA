class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n = obstacles.length;
        int l = 0;
        int[] res = new int[n];
        int[] trace = new int[n];
        for (int i = 0; i < n; ++i) {
            int left = 0, right = l;
            while (left < right) {
                int mid = (left + right) / 2;
                if (trace[mid] <= obstacles[i])
                    left = mid + 1;
                else
                    right = mid;
            }
            res[i] = left + 1;
            if (l == left)
                l++;
            trace[left] = obstacles[i];
        }
        return res;
    }
}
