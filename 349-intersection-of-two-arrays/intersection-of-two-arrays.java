class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> hm1=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int a:nums1){
            hm1.add(a);
        }
        HashSet<Integer> hm2=new HashSet<>();
        for(int a:nums2){
            hm2.add(a);
        }
        for(int a:hm1){
            if(hm2.contains(a)){
                list.add(a);
            }
        }
        int[] ans = list.stream().mapToInt(i -> i).toArray();
        return ans;
    }
}