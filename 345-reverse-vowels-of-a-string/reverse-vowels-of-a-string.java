class Solution {
    boolean isVowel(char ch){
        return "AEIOUaeiou".indexOf(ch)>=0;
    }
    public String reverseVowels(String s) {
        char []sch=s.toCharArray();
        int i=0;
        int j=sch.length-1;
        while(i<=j){
            if(isVowel(sch[i])&&isVowel(sch[j])){
                char temp=sch[i];
                sch[i]=sch[j];
                sch[j]=temp;
                i++;
                j--;
            }else if(isVowel(sch[i]) && !isVowel(sch[j])){
                j--;
            }else{
                i++;
            }
        }
        return new String(sch);
    }
}