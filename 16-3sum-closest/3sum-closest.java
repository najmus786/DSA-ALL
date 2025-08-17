class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int minDiff=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int diff;
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>target){
                    diff=sum-target;
                    if(diff<minDiff){
                        minDiff=diff;
                        ans=sum;
                    }
                    k--;
                }else if(sum<target){
                    diff=target-sum;
                    if(diff<minDiff){
                        minDiff=diff;
                        ans=sum;
                    }
                    j++;
                }else{
                    ans=sum;
                    j++;
                    k--;
                }
            }

        }
        return ans;
    }
}