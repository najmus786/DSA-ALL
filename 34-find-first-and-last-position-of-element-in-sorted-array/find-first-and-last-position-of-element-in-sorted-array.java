class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstOcc(nums,target);
        int last=lastOcc(nums,target);
        return new int[]{first,last};
    }
     int firstOcc(int []nums,int target){
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                ans=mid;
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
    int lastOcc(int []nums,int target){
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                ans=mid;
                l=mid+1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
}