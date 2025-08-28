class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<k;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        ans.add(hm.size());
        int j=0;
        for(int i=k;i<arr.length;i++){
            if(hm.get(arr[j])==1){
                hm.remove(arr[j]);
            }else{
                hm.put(arr[j],hm.get(arr[j])-1);
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            ans.add(hm.size());
            j++;
        }
        return ans;
    }
}