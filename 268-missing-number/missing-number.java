class Solution {
    public int missingNumber(int[] nums) {
        int missNumber=0;
        for(int i=0;i<=nums.length;i++){
            missNumber^=i;
        }
        for(int a:nums){
            missNumber ^=a;
        }
        return missNumber;
    }
}