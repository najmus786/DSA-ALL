class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:nums){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(int a:hm.keySet()){
            if(hm.get(a)==1){
                return a;
            }
        }
        return -1;
    }
}