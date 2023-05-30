class MyHashSet {
    int MIN_VALUE = Integer.MIN_VALUE;
    int[] hash_array = new int[6]; // initialize with 6 value;

    public MyHashSet() {
        this.hash_array =fillArray(this.hash_array,MIN_VALUE);
    }
    
    public void add(int key) {

        if(key > hash_array.length - 1){
            rehashing(key);
        }

        this.hash_array[key] = 1;
        
    }
    
    public void remove(int key) {

        if(key > hash_array.length - 1)
            return;
        this.hash_array[key] = MIN_VALUE;
        
    }
    
    public boolean contains(int key) {
        if(key > hash_array.length - 1)
            return false;
        
        return !(hash_array[key] == MIN_VALUE);
        
    }

    private void rehashing(int n){
        int[] temp = fillArray(new int[2*n],MIN_VALUE);
        int hashLength = hash_array.length;

        for(int i =0 ;i < hashLength;i++ ){
            temp[i] = hash_array[i];
        }

        this.hash_array = temp;


    }
    private int[] fillArray(int[] arr , int val){
        for(int i=0 ;i<arr.length;i++){
            arr[i] = val;
        }

        return arr;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
