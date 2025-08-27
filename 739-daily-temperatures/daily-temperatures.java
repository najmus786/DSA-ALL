class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        int result[]=new int [temperatures.length];
        for(int currentDay=0;currentDay<temperatures.length;currentDay++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[currentDay]){
                int prevDay=stack.peek();
                int warmDay=currentDay-prevDay;
                result[prevDay]=warmDay;
                stack.pop();
            }
            stack.push(currentDay);
        }
        return result;
    }
}