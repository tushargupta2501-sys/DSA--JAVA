
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }

        boolean normal = true;
        for (int i = 0; i < n; i++) {
            if (nums[(zero + i) % n] != i) {
                normal = false;
                break;
            }
        }

        boolean reversed = true;
        for (int i = 0; i < n; i++) {
            if (nums[(zero - i + n) % n] != i) {
                reversed = false;
                break;
            }
        }

        int ans = Integer.MAX_VALUE;

        if (normal) {
            int leftRotations = zero;
            int rightRotationCost =
                zero == 0 ? 0 : n - zero + 2;

            ans = Math.min(leftRotations, rightRotationCost);
        }

        if (reversed) {
            int cost1 = 1 + (zero + 1) % n;
            int cost2 = 1 + (n - 1 - zero);

            ans = Math.min(ans, Math.min(cost1, cost2));
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
