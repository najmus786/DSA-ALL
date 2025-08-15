class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int a:nums){
            hs.put(a,hs.getOrDefault(a,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(0) && hs.get(0)!=0){
                nums[i]=0;
                hs.put(0,hs.get(0)-1);
            }
            else if(hs.containsKey(1)&& hs.get(1)!=0){
                nums[i]=1;
                hs.put(1,hs.get(1)-1);
            }
            else if(hs.containsKey(2)&& hs.get(2)!=0){
                nums[i]=2;
                hs.put(2,hs.get(2)-1);
            }
        }
    }
}