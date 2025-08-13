class Solution {
    public int[] plusOne(int[] arr) {
        int n=arr.length;
        if(n<=1){
            if(arr[n-1]==9){
                return new int[]{1,0};
            }
        }
        if(arr[n-1]!=9){
            arr[n-1]=arr[n-1]+1;
            return arr;
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==9){
                arr[i]=0; 
            }else{
                arr[i]++;
                return arr;
            }
        }
        if(arr[0]>=1 && arr[0]<=8){
            arr[0]=arr[0]+1;
        }else{
            int ans[]=new int [n+1];
            ans[0]=1;
            return ans;
        }

        return arr;

    }
}