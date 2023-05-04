import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();
        int size = senate.length();

        for(int i=0 ; i< size ; i++){
            if(senate.charAt(i) == 'D')dQueue.offer(i);
            else rQueue.offer(i);
        }

        while(!rQueue.isEmpty() && !dQueue.isEmpty()){
            if(rQueue.poll() < dQueue.poll()){
                rQueue.offer(size++);
            }
            else dQueue.offer(size++);
        }

        return !rQueue.isEmpty() ? "Radiant" : "Dire";
    }
}