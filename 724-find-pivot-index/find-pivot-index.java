class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int []pref=new int [n];
        int []post=new int [n];
        pref[0]=nums[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        post[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            post[i]=post[i+1]+nums[i];
        }
        for(int i=0;i<n;i++){
            if(pref[i]==post[i]){
                return i;
            }
        }
        return -1;
    }
}