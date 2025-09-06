class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int count=0;
        int maxCount=0;
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            count++;
            maxCount=Math.max(maxCount,count);
            if(i!=arr.length-1){
                int b=arr[i+1];
                if(a!=b){
                    count=0;
                }   
            }
        }
        return maxCount;
    }
}
