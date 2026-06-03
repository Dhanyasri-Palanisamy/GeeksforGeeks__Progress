class Solution {
    int stockBuySell(int arr[]) {
        // code here
        int total=0;
        for(int i=1;i<arr.length;i++){
             if(arr[i-1]<arr[i]){
                 total+=arr[i]-arr[i-1];
             }
        }
        return total;
    }
}
