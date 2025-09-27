class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        String ans="";
        for(char ch:num.toCharArray()){
            while(!st.isEmpty() && k>0&& (st.peek()-'0')>(ch-'0')){
                st.pop();
                k=k-1;
            }
            st.push(ch);
        }
        while(k>0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        if(st.isEmpty())return "0";

         StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        
        // Remove leading zeros manually
        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }
        String result = sb.substring(i);
        
        return result.isEmpty() ? "0" : result;

    }
}