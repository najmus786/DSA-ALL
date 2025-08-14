class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int maxArea=0;
        while(i<j){
            int min=Math.min(arr[i],arr[j]);
            int height=Math.abs(j-i);
            maxArea=Math.max(maxArea,min*height);
            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}