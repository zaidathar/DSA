class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue(Comparator.reverseOrder());

        for(int i : nums){
            pq.add(i);
        }
        while(k > 1){
            k--;
            pq.poll();
        }

        return pq.peek();
    }
}
