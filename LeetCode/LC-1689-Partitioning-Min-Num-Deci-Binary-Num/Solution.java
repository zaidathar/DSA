class Solution {
    public int minPartitions(String n) {
        int max = 0 ;
        for(int i=0;i<n.length();i++){
            int dig = n.charAt(i) -'0';
            max = max < dig ? dig : max;
        }
        return max;
    }
}