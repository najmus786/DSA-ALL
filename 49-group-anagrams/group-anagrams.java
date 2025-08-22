class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String str:strs){
            char [] ch=str.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(!hm.containsKey(st)){
                hm.put(st,new ArrayList<String>());
            }
            hm.get(st).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}