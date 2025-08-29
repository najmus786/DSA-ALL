class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int prod=1;
        int start=0;
        if(k<=1){
            return 0;
        }
        for(int end=0;end<nums.length;end++){
            prod*=nums[end];
            while(prod>=k){
                prod/=nums[start++];
            }
            if(prod<k){
                count+=end-start+1;
            }
        }
        return count;
    }
}