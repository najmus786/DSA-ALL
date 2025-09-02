class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(hm.containsKey(num)){
                int len=i-hm.get(num);
                if(len<=k){
                    return true;
                }
            }
            hm.put(num,i);
        }
        return false;
    }
}