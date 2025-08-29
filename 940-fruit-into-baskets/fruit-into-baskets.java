class Solution {
    public int totalFruit(int[] fruits) {
        int left=0,max=0;
        HashMap<Integer,Integer> basket=new HashMap<>();
        for(int right=0;right<fruits.length;right++){
            basket.put(fruits[right],basket.getOrDefault(fruits[right],0)+1);

            while(basket.size()>2){
                int count=basket.get(fruits[left]);
                if(count==1){
                    basket.remove(fruits[left]);
                }else{
                    basket.put(fruits[left],count-1);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}