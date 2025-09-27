class Solution {
        public int precedence(char op) {
            if (op == '+' || op == '-') return 1;
            if (op == '*' || op == '/') return 2;
            return 0;
        }
        private List<String> infixToPostfix(String s) {
        List<String> postfix = new ArrayList<>();
        Stack<Character> ops = new Stack<>();
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            if (c == ' ') continue;
            
            if (Character.isDigit(c)) {
                // multi-digit number
                int num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; 
                postfix.add(String.valueOf(num));
            } 
            else { // operator
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
                    postfix.add(String.valueOf(ops.pop()));
                }
                ops.push(c);
            }
        }
        
        while (!ops.isEmpty()) {
            postfix.add(String.valueOf(ops.pop()));
        }
        
        return postfix;
    }
    private int evalPostfix(List<String> postfix) {
        Stack<Integer> st = new Stack<>();
        
        for (String token : postfix) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                switch (token) {
                    case "+": st.push(a + b); break;
                    case "-": st.push(a - b); break;
                    case "*": st.push(a * b); break;
                    case "/": st.push(a / b); break; // java auto truncate toward 0
                }
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        
        return st.pop();
    }

    public int calculate(String s) {
        List<String> postfix = infixToPostfix(s);
        return evalPostfix(postfix);
    }
}