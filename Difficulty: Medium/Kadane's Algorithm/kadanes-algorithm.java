class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
       int currentSum = arr[0];
       int maxs= arr[0];
       for(int i=1;i<arr.length;i++){
           
           currentSum= Math.max(arr[i],currentSum+arr[i]);
           maxs= Math.max(currentSum,maxs);
       }
       return maxs;
        
    }
}
