class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> minSt=new Stack<>();
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(minSt.isEmpty() || val<=minSt.peek()){
            minSt.push(val);
        }
    }
    
    public void pop() {
        if(st.isEmpty())return;
        if(st.peek().equals(minSt.peek())) {  // ✅ compare values
            minSt.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */