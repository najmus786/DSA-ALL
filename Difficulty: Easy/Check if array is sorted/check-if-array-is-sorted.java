class Solution {
    public boolean isSorted(int[] arr) {
        return isSortedRecursive(arr, arr.length);
    }

    private boolean isSortedRecursive(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        if (arr[n - 1] < arr[n - 2]) {
            return false;
        }
        return isSortedRecursive(arr, n - 1);
    }
}
