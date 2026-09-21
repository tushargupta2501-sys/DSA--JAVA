class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[0];
        int sum = 0;

        for (int i = 1; i < prices.length; i++) {

            // Price is going up
            if (prices[i] >= prices[i - 1]) {
                max = prices[i];
            }

            // Price started going down
            else {
                sum += max - min;

                min = prices[i];
                max = prices[i];
            }
        }

        // Add the last transaction
        sum += max - min;

        return sum;
    }
}