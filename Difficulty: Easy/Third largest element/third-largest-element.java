class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        if(arr.length<3){
            return -1;
        }
        int first=Math.min(arr[0],Math.min(arr[1],arr[2]));
        int third=Math.max(arr[0],Math.max(arr[1],arr[2]));
        int second=arr[0]+arr[1]+arr[2]-first-third;
        for(int i=3;i<arr.length;i++){
            if(arr[i]>=first && arr[i]>=second && arr[i]>=third){
                first=second;
                second=third;
                third=arr[i];
            }
            else if(arr[i]>=first && arr[i]>=second && arr[i]<=third){
                first=second;
                second=arr[i];
            }
            else if(arr[i]>=first && arr[i]<=second && arr[i]<=third){
                first=arr[i];
            }
        }
        if(first==second && second==third){
            return first;
        }
        return first;
    }
}