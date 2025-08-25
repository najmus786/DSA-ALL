class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i=0;
        int j=0;
        int m=a.length;
        int n=b.length;
        int s=0;
        int arr[]=new int[m+n];
        while(i<m && j<n){
            if(a[i]<b[j]){
                arr[s]=a[i];
                i++;
            }else{
                arr[s]=b[j];
                j++;
            }
            s++;
        }
        while(i<m){
            arr[s]=a[i];
            i++;
            s++;
        }
        while(j<n){
            arr[s]=b[j];
            j++;
            s++;
        }
        return arr[k-1];
    }
}