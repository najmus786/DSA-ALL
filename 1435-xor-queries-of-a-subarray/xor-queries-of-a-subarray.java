class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ans[]=new int [queries.length];
        int xrr[]=new int[arr.length];
        xrr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            xrr[i]=xrr[i-1]^arr[i];
        }
        for(int i=0;i<queries.length;i++){
            int j=queries[i][0];
            int k=queries[i][1];
            if(j>0){
                ans[i]=xrr[j-1]^xrr[k];
            }else{
                ans[i]=xrr[k];
            }
        }
        return ans;
    }
}