class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int writer=0;
        for(int reader=1;reader<n;reader++){
            if(nums[writer]!=nums[reader]){
                writer++;
                nums[writer]=nums[reader];
            }
        }
        return writer+1;
    }
}