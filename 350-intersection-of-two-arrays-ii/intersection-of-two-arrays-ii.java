class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm1=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();
        for(int a:nums1){
            hm1.put(a,hm1.getOrDefault(a,0)+1);
        }
        for(int a:nums2){
            hm2.put(a,hm2.getOrDefault(a,0)+1);
        }
        for(int a:hm1.keySet()){
            if(hm2.containsKey(a)){
                int i=0;
                int j=0;
                while(i<hm1.get(a)&& j<hm2.get(a)){
                    ans.add(a);
                    i++;
                    j++;
                }
            }
        }
        int []arr=ans.stream().mapToInt(i->i).toArray();
        return arr;
    }
}