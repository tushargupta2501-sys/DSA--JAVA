class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                max = nums[i];
                k = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i != k && nums[i] * 2 > max) {
                return -1;
            }
        }

        return k;
    }
}