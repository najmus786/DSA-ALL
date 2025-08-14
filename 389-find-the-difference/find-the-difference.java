class Solution {
    public char findTheDifference(String s, String t) {
        char [] ch1=s.toCharArray();
        char [] ch2=t.toCharArray();
        int sum1=0;
        int sum2=0;
        for(char ch:ch1){
            sum1+=(int)ch;
        }
        for(char ch:ch2){
            sum2+=(int)ch;
        }
        int ascii=sum2-sum1;
        return (char)ascii; 
    }
}