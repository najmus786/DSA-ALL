class Solution {
    public int getSecondLargest(int[] arr) {
        if(arr.length<2){
            return -1;
        }
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        Set<Integer> set=new HashSet<>();
        for(int a:arr){
            set.add(a);
        }
        for(int a:set){
            pq.add(a);
        }
        int k=pq.remove();
        if(pq.size()==0){
            return -1;
        }
        int m=pq.remove();
        return m;
    }
}