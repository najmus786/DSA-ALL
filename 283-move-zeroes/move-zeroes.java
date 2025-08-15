class Solution {
    public void moveZeroes(int[] nums) {
        int writer=0;
        for(int reader=0;reader<nums.length;reader++){
            if(nums[reader]!=0){
                nums[writer]=nums[reader];
                writer++;
            }
        }
        for(int i=writer;i<nums.length;i++){
            nums[i]=0;
        }
    }
}