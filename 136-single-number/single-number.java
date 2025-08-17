class Solution {
    public int singleNumber(int[] nums) {
        int singleNum=0;
        for(int a:nums){
            singleNum^=a;
        }
        return singleNum;
    }
}