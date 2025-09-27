class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder("");
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && st.peek().equals(ch)){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        int i=0;
        int j=sb.length()-1;

        String ans=new StringBuilder(sb.toString()).reverse().toString();

        return ans; 
    }
}