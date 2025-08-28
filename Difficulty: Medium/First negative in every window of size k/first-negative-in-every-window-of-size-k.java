class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<k;i++){
            if(arr[i]<0){
                que.offer(arr[i]);
            }
        }
        ans.add(que.isEmpty()?0:que.peek());
        int j=0;
        for(int i=k;i<n;i++){
            if(arr[j]<0){
                que.poll();
            }
            if(arr[i]<0){
                que.offer(arr[i]);
            }
            j++;
            ans.add(que.isEmpty()?0:que.peek());
        }
        return ans;
    }
}