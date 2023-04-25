class SmallestInfiniteSet {
    PriorityQueue<Integer> pq ;
    int tail;
  
    public void insertValue(int n , int m){
        while(n <= m){
            pq.offer(n);
            n++;
        }
        tail = m;
    }
    public SmallestInfiniteSet() {
        pq = new PriorityQueue<Integer>();
        insertValue(1,1000);
        tail = 1000;
    }
    
    public int popSmallest() {
        return pq.poll();

    }
    
    public void addBack(int num) {
        if(pq.contains(num))return;
        if(pq.isEmpty())pq.offer(num);

        if(tail < num){
            insertValue(tail+1,num);

        }
        else pq.offer(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
