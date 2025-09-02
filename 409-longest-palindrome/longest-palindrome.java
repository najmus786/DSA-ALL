class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int digOne=0;
        int total=0;
        for(char ch:hm.keySet()){
            int count=hm.get(ch);
            if(count==1){
                digOne++;
            }
            else if(count%2==0){
                total+=count;
            }else{
                total+=count-1;
                digOne++;
            }
        }
        return digOne>0?total+1:total;
    }
}