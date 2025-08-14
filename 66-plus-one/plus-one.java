class Solution {
    public int[] plusOne(int[] arr) {
       for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==9){
                arr[i]=0;
                continue;
            }else{
                arr[i]=arr[i]+1;
                return arr;
            }
       }
       if(arr[0]==0){
            int ans[]=new int[arr.length+1];
            ans[0]=1;
            return ans;
       }
       return arr;
    }
}