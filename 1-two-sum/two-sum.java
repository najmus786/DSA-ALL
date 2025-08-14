class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []copy=Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int pre=0;
        int mi=0;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==target){
                pre=nums[i];
                mi=nums[j];
                break;
            }else if(sum>target){
                j--;
            }else if(sum<target){
                i++;
            }
        }
        int first=-1;
        int second=-1;
        //int ans[]=new int[2];
        for(int k=0;k<nums.length;k++){
            if(first==-1 && pre==copy[k]){
                first=k;
            }
            else if(second==-1 && mi==copy[k]){
                second=k;
            }
        }
        return new int[]{first,second};
    }
}