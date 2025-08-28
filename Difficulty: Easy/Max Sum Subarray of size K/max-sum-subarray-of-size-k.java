class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxSum=sum;
        int j=0;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[j];
            maxSum=Math.max(maxSum,sum);
            j++;
        }
        return maxSum;
    }
}