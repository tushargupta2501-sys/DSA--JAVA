class Solution {
    public int[] replaceElements(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int j = i + 1;
            int max = arr[j];

            while (j < n) {

                if (arr[j] > max) {
                    max = arr[j];
                }

                j++;
            }

            arr[i] = max;
        }

        arr[n - 1] = -1;

        return arr;
    }
}