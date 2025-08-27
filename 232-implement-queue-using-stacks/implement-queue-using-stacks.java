class MyQueue {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public MyQueue() {
        
    }
    void shuffle(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
    }
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        shuffle();
        return stack2.pop();
    }
    
    public int peek() {
        shuffle();
        return stack2.peek();
    }
    
    public boolean empty() {
        if(stack1.isEmpty() && stack2.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */