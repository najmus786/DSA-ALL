class Solution {
    public int findMaxLength(int[] nums) {
        int maxLen=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int len=0;
            if(hm.containsKey(sum)){
                len=i-hm.get(sum);
                maxLen=Math.max(len,maxLen);
            }else{
                hm.put(sum,i);
            }
        }
        return maxLen;
    }
}