import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int a = arr[i];
            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int sum = a + arr[j]+arr[k];

                if (sum == 0) {
                    ans.add(Arrays.asList(a, arr[j], arr[k]));
                    while (j < k && arr[j] == arr[j + 1]) j++;
                    while (j < k && arr[k] == arr[k - 1]) k--;

                    j++;
                    k--;
                } 
                else if (sum< 0) {
                    j++;
                } 
                else {
                    k--;
                }
            }
        }

        return ans;
    }
}
