class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n<2){
            return nums[0];
        }
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(mid % 2!=0){
                mid--;
            } 
            if(nums[mid]==nums[mid+1]){
                left=mid+2;
            }else{
                right=mid;
            }
        }
        return nums[left];
    }
}