class Solution {
    public ArrayList<Integer> topKFrequent(int[] arr, int k) {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        ArrayList<Map.Entry<Integer,Integer>> al=new ArrayList<>(map.entrySet());
        Collections.sort(al,(a,b)->
            a.getValue().equals(b.getValue())?
            b.getKey().compareTo(a.getKey()):
            b.getValue().compareTo(a.getValue()));
        int i=0;
        for(Map.Entry<Integer,Integer> m:al){
            if(i<k){
                ans.add(m.getKey());
                i++;
            }
        }
        
        return ans;
        
    }
}
