class Solution {
    public int search(int[] nums, int target) {
        return newSearch(nums,target,0,nums.length-1);
    }
    public static int newSearch(int arr[],int target,int start,int end){
        if (start > end) {
            return -1; 
        }
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }else if(target>arr[mid]){
            return newSearch(arr,target,mid+1,end);
        }else {
            return newSearch(arr,target,start,mid-1);
        }

    }
}