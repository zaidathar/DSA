class Solution {
public:
    int bS(vector<int>& arr,int l,int r,int x){
        if(l<=r){
            int mid=l+r;mid/=2;
            
            if(arr[mid]==x)return mid;
            else if(arr[mid]> x)return bS(arr,l,mid-1,x);
            else return bS(arr,mid+1,r,x);
        }
        return -1;
        
    }
    int search(vector<int>& nums, int target) {
        int ind=-1,size=nums.size();
        for(int i=1;i<size;i++){
            if(nums[i]<nums[i-1]){
                ind=i;
                break;
            }
        }
        
        if(ind==-1){
            return bS(nums,0,size-1,target);
        }
        else{
            int found=bS(nums,0,ind-1,target);
            
            if(found==-1){
                found=bS(nums,ind,size-1,target);
                return found;
            }
            else{
                return found;
            }
        }
        
        
    }
};
