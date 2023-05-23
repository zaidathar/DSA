class KthLargest {
    private int k;
    private List<Integer> list = new ArrayList<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        
        for(int num : nums){
            list.add(num);
        }
    }
    
    public int add(int val) {
        this.list.add(val);
        Collections.sort(list);
        return this.list.get(list.size()- k);
    }
}
