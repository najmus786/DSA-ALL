class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int i=0;
        int sum=0;
        while(i<s.length()){
            int nextVal=0;
            char curr=s.charAt(i);
            int curVal=hm.get(curr);
            if(i+1<s.length()){
                char next=s.charAt(i+1);
                nextVal=hm.get(next);
            }
            if(curVal<nextVal){
                sum+=nextVal-curVal;
                i=i+2;
            }else{
                sum+=curVal;
                i++;
            }
        }
        return sum;
    }
}