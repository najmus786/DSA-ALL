// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> al = new ArrayList<>();
        int first = getFirst(arr, x);
        int last = getLast(arr, x);

        al.add(first);
        al.add(last);
        return al;
    }

    int getFirst(int[] arr, int x) {
        int i = 0, j = arr.length - 1, ans = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == x) {
                ans = mid;
                j = mid - 1; // keep searching left
            } else if (arr[mid] > x) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }

    int getLast(int[] arr, int x) {
        int i = 0, j = arr.length - 1, ans = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == x) {
                ans = mid;
                i = mid + 1; // keep searching right
            } else if (arr[mid] > x) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }
}
