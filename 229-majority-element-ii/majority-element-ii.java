class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:nums){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(int a:hm.keySet()){
            if(hm.get(a)>Math.floor(n/3)){
                ans.add(a);
            }
        }
        return ans;
    }
}