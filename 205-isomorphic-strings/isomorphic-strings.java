class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char si = s.charAt(i);
            char ti = t.charAt(i);

            if (map1.containsKey(si) && !map1.get(si).equals(ti)) return false;
            if (map2.containsKey(ti) && map2.get(ti) != si) return false;

            map1.put(si,ti);
            map2.put(ti,si);
        }
        return true;
    }
}