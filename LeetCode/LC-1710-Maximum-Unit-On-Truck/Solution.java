class Solution {
    
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        /*
        // My Approach with O(nlogn) & O(1) complexity
        Arrays.sort(boxTypes ,Comparator.comparingInt(o -> o[1]));

        int maxUnits = 0 , ind = boxTypes.length-1;
        while(truckSize > 0){
            if(ind < 0)break;
            
            maxUnits+=(truckSize >= boxTypes[ind][0] ? boxTypes[ind][0]*boxTypes[ind][1] : truckSize * boxTypes[ind][1]);
            truckSize -= boxTypes[ind][0];
            ind--;
        }
        return maxUnits;
        */
        
        // Trying Better Approach after refering with O(N) & O(N) complexity
        
        int[] boxPerUnit = new int[1001];
        for(int i =0 ;i<boxTypes.length;i++){
            
            int val = boxPerUnit[boxTypes[i][1]]+boxTypes[i][0];
            boxPerUnit[boxTypes[i][1]]=val;
            
        }
        
        int maxUnits = 0 ;
        for(int i = 1000 ; i>=1;i--){
            if(truckSize <=0)break;
            int numberOfBox = boxPerUnit[i];
            if(numberOfBox==0)continue;
            maxUnits+=(truckSize >= numberOfBox ? numberOfBox*i : truckSize*i);
            truckSize-=numberOfBox;
        }
        return maxUnits;
    }
}