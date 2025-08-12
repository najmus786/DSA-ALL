class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        al.add(arr[arr.length-1]);
        int max=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                al.add(arr[i]);
            }
        }
        Collections.reverse(al);
        return al;
    }
}
