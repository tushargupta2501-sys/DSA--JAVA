class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        int max = nums[0];

        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        boolean secondFound = false;
        boolean thirdFound = false;

        for (int i = 0; i < n; i++) {
            if (nums[i] < max && 
                (!secondFound || nums[i] > secondMax)) {
                secondMax = nums[i];
                secondFound = true;
            }
        }

        if (!secondFound) {
            return max;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] < secondMax &&
                (!thirdFound || nums[i] > thirdMax)) {
                thirdMax = nums[i];
                thirdFound = true;
            }
        }

        if (!thirdFound) {
            return max;
        }

        return thirdMax;
    }
}