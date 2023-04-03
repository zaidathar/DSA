class Solution {
    public int bruteForceApproach(int[] people, int limit){
        // Brute Force Solution
        // Getting time limit exceed , hope this cover all corner cases
        int len = people.length , cnt = 0;
        int[] index = new int[len];
        for(int i = 0; i < len; i++){
            if(index[i]!= 0)continue;
            index[i] = 1;
            int diff = Integer.MAX_VALUE , remember = -1;
            for(int j = i+1; j < len ; j++){
                int weigth = people[i] + people[j] ;
                if(weigth <= limit && index[j] == 0 && limit - weigth < diff){
                   diff = limit - weigth;
                   remember = j;
                }
            }
            if(remember != -1){
                index[remember] =1 ;
            }
            cnt++;
        }
        return cnt;
    }

    public int optimalApproach(int [] people , int limit){
        Arrays.sort(people);
        int front = 0 , back = people.length -1 ;
        int cnt = 0; 
        while(back >= front){
            if(people[back] + people[front] <= limit){ 
                front ++;
            }
            back --;
            cnt++;
        }

        return cnt;
    }

    public int numRescueBoats(int[] people, int limit) {
       //bruteForceApproach(people,limit);
       optimalApproach(people,limit);
    }
}