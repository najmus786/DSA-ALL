class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int num = 0;
        int sign = 1;  // +1 for positive, -1 for negative
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');  // build number
            } 
            else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } 
            else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } 
            else if (c == '(') {
                // push result and sign
                stack.push(result);
                stack.push(sign);
                // reset for inner expression
                result = 0;
                sign = 1;
            } 
            else if (c == ')') {
                result += sign * num;  // finish the number
                num = 0;
                result *= stack.pop(); // pop sign
                result += stack.pop(); // pop previous result
            }
        }
        
        // add last number
        result += sign * num;
        
        return result;
    }
}
