class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int i =0 ,k =0 , j =0 , size1 = num1.length,size2 = num2.length;
        
        int[] arr = new int[size1 + size2];
        
        while(true){
            if(i>=size1){
                while(k<size1+size2){
                    arr[k] = num2[j];
                    k++;j++;
                }
                break;
                
            }
            else if(j >=size2){
                while(k<size1+size2){
                    arr[k] = num1[i];
                    k++;i++;
                }
                break;
            }
            
            if(num1[i] < num2[j]){
                System.out.println(i);
                arr[k] = num1[i];
                i++;
            }
            else{
                arr[k] = num2[j];
                j++;
            }
            k++;
            
        }
        int mid = arr.length /2;
        if(arr.length % 2 ==0){
            return (double)(arr[mid] + arr[mid-1])/2;
        }
        return (double)arr[mid];
    }
}
