class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int totalSum=0;
        int leftSum=0;
        int rightSum=0;
        for(int a:nums){
            totalSum+=a;
        }
        for(int i=0;i<n;i++){
            leftSum+=nums[i];
            rightSum=totalSum-leftSum+nums[i];
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }
}