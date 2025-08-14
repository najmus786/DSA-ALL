class Solution {
    public int getSecondLargest(int[] arr) {
        if(arr.length<2){
            return -1;
        }
        // code here
        int min=Math.min(arr[0],arr[1]);
        int max=Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            if((arr[i]==min)||(arr[i]==max)){
                continue;
            }
            if(arr[i]>min && arr[i]>max){
                min=max;
                max=arr[i];
            }else if(arr[i]>min&&arr[i]<max){
                min=arr[i];
            }
        }
        if(min==max){
            return -1;
        }
        return min;
    }
}