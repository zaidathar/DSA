class MinStack {
    private ArrayList<Integer> stack;
    private ArrayList<Integer> minVal;
    public MinStack() {
        this.stack = new ArrayList<Integer>();
        this.minVal = new ArrayList<Integer>();
        
    }
    
    public void push(int val) {
        stack.add(val);
        if(minVal.size()==0){
            minVal.add(val);
        }
        else{
            int last = minVal.get(minVal.size()-1);
            minVal.add( last < val ? last : val);
        }
        
        
    }
    
    public void pop() {
        int size = stack.size();
        if(size==0)return;
        stack.remove(size-1);
        minVal.remove(size-1);
    }
    
    public int top() {
        int size = stack.size();
        if(size==0)return -1;
        return stack.get(size-1);
    }
    
    public int getMin() {
        int size = minVal.size();
        if(size==0)return -1;
        return minVal.get(size-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */