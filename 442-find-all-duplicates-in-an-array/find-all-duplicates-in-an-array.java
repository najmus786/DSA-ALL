class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int []arr=new int[n+1];
        for(int a:nums){
            arr[a]++;
        }
        for(int i=1;i<n+1;i++){
            if(arr[i]>1){
                ans.add(i);
            }
        }
        return ans;
    }
}