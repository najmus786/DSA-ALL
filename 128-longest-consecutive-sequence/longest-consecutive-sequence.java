class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int maxLen=0;
        int len=0;
        if(nums.length==0){
            return 0;
        }
        for(int a:nums){
            hs.add(a);
        }
        for(Integer a:hs){
            int prev=a-1;
            if(!hs.contains(prev)){
                len=1;
                int next=a+1;
                while(hs.contains(next)){
                    len++;
                    next=next+1;
                }
                maxLen=Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
}