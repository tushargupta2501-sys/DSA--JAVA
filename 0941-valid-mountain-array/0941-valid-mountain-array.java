class Solution {
    public boolean validMountainArray(int[] arr) {

        int n = arr.length;

        
        int max = arr[0];
        int k = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                k = i;
            }
        }

        
        if (k == 0 || k == n - 1) {
            return false;
        }

       
        for (int i = 0; i < k; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }

      
        for (int i = k; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}