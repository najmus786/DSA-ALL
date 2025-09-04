/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=findPeak(mountainArr);
        int indLeft=binarySearchAscending(mountainArr,target,0,peak);
        if(indLeft!=-1){
            return indLeft;
        }
        int indRight=binarySearchDescending(mountainArr,target,peak+1,mountainArr.length()-1);
        return indRight;
    }
    public int findPeak(MountainArray mountainArr){
        int l=0;
        int r=mountainArr.length()-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return l;
    }
    public int binarySearchAscending(MountainArray mountainArr, int target, int l, int r) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int val = mountainArr.get(mid);
            if (val == target) return mid;
            if (val < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public int binarySearchDescending(MountainArray mountainArr, int target, int l, int r) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int val = mountainArr.get(mid);
            if (val == target) return mid;
            if (val > target) l = mid + 1; // Notice: reverse logic
            else r = mid - 1;
        }
        return -1;
    }
}