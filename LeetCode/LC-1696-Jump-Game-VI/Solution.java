class Solution {
    public int maxResult(int[] arr, int k) {
        int n = arr.length;
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(0);
        for (int i = 1; i < n; ++i) {
            arr[i] = arr[deque.peekFirst()] + arr[i];
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) 
            {
            	deque.pollLast();
            }
            deque.offerLast(i);

            if (i - deque.peekFirst() >= k) {
            	deque.pollFirst();
            }
        }
        return arr[n - 1];
    }
}