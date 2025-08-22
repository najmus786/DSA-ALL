class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String str:strs){
            int countArr[]=new int[26];
            for(char c:str.toCharArray()){
                countArr[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int k:countArr){
                sb.append(k).append('#');
            }
            String key=sb.toString();
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<String>());
            }
            hm.get(key).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}