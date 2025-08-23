class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxAve=sum*1.0/k;
        int j=0;
        for(int i=k;i<n;i++){
            sum+=nums[i]-nums[j];
            double ave=sum*1.0/k;
            maxAve=Math.max(maxAve,ave);
            j++;
        }
        return maxAve;
    }
}