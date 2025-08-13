class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        Arrays.sort(nums);
        if(nums[0]!=0){
            return 0;
        }
        for(int a:nums){
            hm.put(a,1);
        }
        for(int a:nums){
            if(hm.containsKey(a+1)){
                continue;
            }else{
                return a+1;
            }
        }
        return nums.length;
    }
}