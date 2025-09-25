class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hm=new HashMap<>();
        hm.put('(',')');
        hm.put('{','}');
        hm.put('[',']');
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            if(ch==')' || ch=='}' || ch==']'){
                if(st.size()==0){
                    return false;
                }
                if(ch==hm.get(st.peek())){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if(st.size()==0){
            return true;
        }
        return false;
    }
}