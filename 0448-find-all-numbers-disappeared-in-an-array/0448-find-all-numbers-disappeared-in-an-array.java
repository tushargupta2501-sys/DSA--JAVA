

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        int n = nums.length;

        for (int arr : nums) {
            set.add(arr);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return new ArrayList<>(result);
    }
}
