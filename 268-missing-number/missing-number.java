class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int realSum=0;
        for(int a:nums){
            realSum+=a;
        }
        return expectedSum-realSum;
    }
}