class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int partitionIdx = 0;
        int maxLeft = nums[0];
        int maxOverall = nums[0];

        for (int i = 1; i < n; i++) {
            maxOverall = Math.max(maxOverall, nums[i]);
            if (nums[i] < maxLeft) {
                // Must include nums[i] in left partition
                partitionIdx = i;
                maxLeft = maxOverall;
            }
        }

        return partitionIdx + 1;
    }
}
