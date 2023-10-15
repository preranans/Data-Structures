class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (prices[j] < prices[i]) {
                i = j;  
            } else {
                int currentProfit = prices[j] - prices[i];
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }
}
