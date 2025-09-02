class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int ans=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            ans^=arr[i];
        }
        return ans;
    }
}