class Solution {
    
    public int lastStoneWeight(int[] stones) {
        if(stones.length < 2)return stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            pq.offer(stone);
        }

        while(!pq.isEmpty() && pq.size() > 1 ){
            int first = pq.poll();
            int second = pq.poll();
            if( first == second )continue;
            pq.offer(first - second);
        }

        return pq.size() == 0 ? 0 : pq.poll();

    }
}
