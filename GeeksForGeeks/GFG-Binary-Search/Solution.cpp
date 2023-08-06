// { Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
// User function template for C++

class Solution {
  public:
    int bs(int arr[] , int l , int r , int target){
        if(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid] > target)return bs(arr,l,mid-1,target);
            else return bs(arr,mid+1,r,target);
        }
        return -1;
    }
    int binarysearch(int arr[], int n, int k) {
        // code here
        return bs(arr,0,n-1,k);
        
    }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;

    while (t--) {
        int N;
        cin >> N;
        int arr[N];
        for (int i = 0; i < N; i++) cin >> arr[i];
        int key;
        cin >> key;
        Solution ob;
        int found = ob.binarysearch(arr, N, key);
        cout << found << endl;
    }
}
  // } Driver Code Ends