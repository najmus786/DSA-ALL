class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(n<k){
            return;
        }
        int j=n-k;
        int a1[]=new int[n-k];
        int a2[]=new int[k];
        for(int i=0;i<n-k;i++){
            a1[i]=nums[i];
        }
        for(int i=0;i<k;i++){
            a2[i]=nums[j];
            j++;
        }
        for(int i=0;i<k;i++){
            nums[i]=a2[i];
        }
        int i=0;
        for(int m=k;m<n;m++){
            nums[m]=a1[i];
            i++;
        }
        
    }
}