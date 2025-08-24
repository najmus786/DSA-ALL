class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int k=0;
        int []ans=new int [m+n];
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i++];
            }else{
                ans[k++]=nums2[j++];
            }
        }
        while(i<m){
            ans[k++]=nums1[i++];
        }
        while(j<n){
            ans[k++]=nums2[j++];
        }
        if((m+n)%2==0){
           double median=(double)(ans[(n+m)/2-1]+ans[(n+m)/2])/2; 
           return median;
        }
        return ans[(n+m)/2];
    }
}